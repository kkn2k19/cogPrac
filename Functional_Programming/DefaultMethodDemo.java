@FunctionalInterface
interface MyInterface {
    void display(); // abstract method

    default void show() {
        System.out.println("Default method in interface");
    }
}

public class DefaultMethodDemo implements MyInterface {
    public void display() {
        System.out.println("abstract display()");
    }

    // overriding default method (optional)
    public void show() {
        System.out.println("overridden default method");
    }

    public static void main(String[] args) {
        MyInterface obj = new DefaultMethodDemo();
        obj.display();
        obj.show();
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// DefaultMethodDemo.java && java DefaultMethodDemo && del
// DefaultMethodDemo.class
// abstract display()
// overridden default method