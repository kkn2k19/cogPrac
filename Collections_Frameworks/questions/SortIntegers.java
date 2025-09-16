// Sort an ArrayList of integers using Collections.sort().

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 10, 40, 20, 30));
        Collections.sort(list);
        System.out.println("sorted list : " + list);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// SortIntegers.java && java SortIntegers && del SortIntegers.class
// sorted list : [10, 20, 30, 40, 50]