// Q2. Use Consumer to print all elements of a list.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerListDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karan", "Saad", "Aamir");
        Consumer<String> printer = s -> System.out.println("Name : " + s);
        names.forEach(printer);
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// ConsumerListDemo.java && java ConsumerListDemo && del ConsumerListDemo.class
// Name : Karan
// Name : Saad
// Name : Aamir