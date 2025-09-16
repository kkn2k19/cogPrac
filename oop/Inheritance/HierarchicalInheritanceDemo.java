class Employee {
    String name;

    void work() {
        System.out.println(name + " is working");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println(name + " is coding");
    }
}

class Tester extends Employee {
    void test() {
        System.out.println(name + " is testing");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Chandan";
        d.work();
        d.code();

        Tester t = new Tester();
        t.name = "Karan";
        t.work();
        t.test();
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Inheritance>cd
// "e:\Karan_codes\Java\cogPrac\oop\Inheritance\" && javac
// HierarchicalInheritanceDemo.java && java HierarchicalInheritanceDemo && del
// HierarchicalInheritanceDemo.class
// Chandan is working
// Chandan is coding
// Karan is working
// Karan is testing