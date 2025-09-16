// Q1. Write a program using Predicate to filter even numbers from a list.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEvenFilter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = n -> n % 2 == 0;

        nums.stream()
                .filter(isEven)
                .forEach(System.out::println);
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// PredicateEvenFilter.java && java PredicateEvenFilter && del
// PredicateEvenFilter.class
// 2
// 4
// 6
// 8
// 10