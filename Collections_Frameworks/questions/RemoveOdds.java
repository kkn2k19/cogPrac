// Remove odd numbers from ArrayList while iterating.

import java.util.*;

public class RemoveOdds {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 != 0) {
                itr.remove();
            }
        }
        System.out.println("After removing odds : " + list);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// RemoveOdds.java && java RemoveOdds && del RemoveOdds.class
// After removing odds : [2, 4, 6]