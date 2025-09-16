// Check if two sets intersect (common elements).

import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        // set1.retainAll(set2);
        // System.out.println("intersection : " + set1);

        System.out.print("Common values : ");
        for (int val : set1) {
            if (set2.contains(val)) {
                System.out.print(val + " ");
            }
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// SetIntersection.java && java SetIntersection && del SetIntersection.class
// intersection : [3, 4]

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// SetIntersection.java && java SetIntersection && del SetIntersection.class
// Common values : 3 4