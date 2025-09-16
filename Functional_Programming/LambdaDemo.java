import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Karan", "Saad", "Aamir"));

        // Traditional way (using for-each loop)
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // using lambda expression with forEach
        names.forEach(name -> System.out.print(name + " "));
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// LambdaDemo.java && java LambdaDemo && del LambdaDemo.class
// Karan Saad Aamir
// Karan Saad Aamir