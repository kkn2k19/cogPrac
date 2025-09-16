// Q5. Combine Predicate + Consumer → filter odd numbers and print them.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Consumer<Integer> printer = n -> System.out.println("Odd : " + n);

        nums.stream()
                .filter(isOdd)
                .forEach(printer);
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && 
// javac PredicateConsumerDemo.java && java PredicateConsumerDemo && del PredicateConsumerDemo.class
// Odd : 1
// Odd : 3
// Odd : 5
