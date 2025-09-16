@FunctionalInterface
interface MyInterface {
    void display();

    static void greet() {
        System.out.println("Static Method in Interface");
    }
}

public class StaticMethodDemo implements MyInterface {
    public void display() {
        System.out.println("abstract display()");
    }

    public static void main(String[] args) {
        MyInterface obj = new StaticMethodDemo();
        obj.display();

        // calling static methods
        MyInterface.greet();
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// StaticMethodDemo.java && java StaticMethodDemo && del StaticMethodDemo.class
// abstract display()
// Static Method in Interface