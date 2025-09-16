class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager manages team");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager(); // upcasting
        Employee e2 = new Developer();

        e1.work(); // Manager manages team (runtime decision)
        e2.work(); // Developer writes code
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Polymorphism>cd
// "e:\Karan_codes\Java\cogPrac\oop\Polymorphism\" && javac OverridingDemo.java
// && java OverridingDemo && del OverridingDemo.class
// Manager manages team
// Developer writes code