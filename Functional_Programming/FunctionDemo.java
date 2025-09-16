import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<Integer, Integer> square = n -> n * n;

        System.out.println(toUpper.apply("karan")); // KARAN
        System.out.println(square.apply(5)); // 25
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// FunctionDemo.java && java FunctionDemo && del FunctionDemo.class
// KARAN
// 25