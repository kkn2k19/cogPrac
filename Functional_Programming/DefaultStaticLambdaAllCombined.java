@FunctionalInterface
interface MyInterface {
    void display();

    default void show() {
        System.out.println("default method in interface");
    }

    static void greet() {
        System.out.println("static method in interface");
    }
}

public class DefaultStaticLambdaAllCombined {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Lambda display()");
        obj.display();
        obj.show();
        MyInterface.greet();
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// DefaultStaticLambdaAllCombined.java && java DefaultStaticLambdaAllCombined &&
// del DefaultStaticLambdaAllCombined.class
// Lambda display()
// default method in interface
// static method in interface