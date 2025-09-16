class Employee {
    String name;

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println(name + " is managing");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Karan";
        m.work();
        m.manage();
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\oop\Inheritance\" &&
// javac InheritanceDemo.java && java InheritanceDemo && del
// InheritanceDemo.class
// Karan is working
// Karan is managing
