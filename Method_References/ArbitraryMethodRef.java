import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArbitraryMethodRef {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Karan", "Saad", "Aamir", "Rahul");

        // Instead of (s1, s2) -> s1.compareToIgnoreCase(s2);
        Collections.sort(names, String::compareToIgnoreCase);

        names.forEach(System.out::println);
    }
}

// e:\Karan_codes\Java\cogPrac\Method_References>cd
// "e:\Karan_codes\Java\cogPrac\Method_References\" && javac
// ArbitraryMethodRef.java && java ArbitraryMethodRef && del
// ArbitraryMethodRef.class
// Aamir
// Karan
// Rahul
// Saad 