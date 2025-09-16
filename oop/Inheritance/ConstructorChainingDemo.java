class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Employee extends Person {
    Employee() {
        super();
        System.out.println("Employee constructor called");
    }
}

class Manager extends Employee {
    Manager() {
        super();
        System.out.println("Manager constructor called");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Inheritance>cd
// "e:\Karan_codes\Java\cogPrac\oop\Inheritance\" && javac
// ConstructorChainingDemo.java && java ConstructorChainingDemo && del
// ConstructorChainingDemo.class
// Person constructor called
// Employee constructor called
// Manager constructor called