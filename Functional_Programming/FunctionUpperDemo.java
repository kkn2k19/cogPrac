// Q4. Use Function to convert a string into uppercase.

import java.util.function.Function;

public class FunctionUpperDemo {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();

        System.out.println(toUpper.apply("karan"));
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// FunctionUpperDemo.java && java FunctionUpperDemo && del
// FunctionUpperDemo.class
// KARAN
