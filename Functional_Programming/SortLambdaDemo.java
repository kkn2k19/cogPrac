import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortLambdaDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Karan", "Saad", "Aamir"));

        // Collections.sort(names); // [Aamir, Karan, Saad]

        // sort by length using lambda
        Collections.sort(names, (a, b) -> a.length() - b.length()); // [Saad, Karan, Aamir]

        System.out.println("sorted by length : " + names);
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// SortLambdaDemo.java && java SortLambdaDemo && del SortLambdaDemo.class
// sorted by length : [Saad, Karan, Aamir]
