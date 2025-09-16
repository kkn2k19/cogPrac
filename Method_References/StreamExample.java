import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karan", "Saad", "Aamir", "Rahul");
        // using lambda
        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        // using method reference
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

// e:\Karan_codes\Java\cogPrac\Method_References>cd
// "e:\Karan_codes\Java\cogPrac\Method_References\" && javac StreamExample.java
// && java StreamExample && del StreamExample.class
// KARAN
// SAAD
// AAMIR
// RAHUL

// KARAN
// SAAD
// AAMIR
// RAHUL
