import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Hello " + s);

        printer.accept("Karan");
        printer.accept("Saad");
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// ConsumerDemo.java && java ConsumerDemo && del ConsumerDemo.class
// Hello Karan
// Hello Saad