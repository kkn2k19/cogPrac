// Remove duplicates from an ArrayList using HashSet.

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Unique elements : " + set);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// RemoveDuplicates.java && java RemoveDuplicates && del RemoveDuplicates.class
// Unique elements : [1, 2, 3, 4, 5]