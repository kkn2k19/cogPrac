class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing team");
    }
}

public class MethodOverRidingDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();

        Manager m = new Manager();
        m.work();

        // polymorphism
        Employee emp = new Manager();
        emp.work(); // runtime binding
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Inheritance>cd
// "e:\Karan_codes\Java\cogPrac\oop\Inheritance\" && javac
// MethodOverRidingDemo.java && java MethodOverRidingDemo && del
// MethodOverRidingDemo.class
// Employee is working
// Manager is managing team
// Manager is managing team