// Write a program to sort a list of strings alphabetically using Collections.sort().

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Cherry"));
        Collections.sort(words);
        System.out.println("alphabetically sorted : " + words);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// SortStrings.java && java SortStrings && del SortStrings.class
// alphabetically sorted : [Apple, Banana, Cherry, Mango]