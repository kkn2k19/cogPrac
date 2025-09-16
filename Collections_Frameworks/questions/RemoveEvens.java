// Use Iterator to remove all even numbers from an ArrayList<Integer>.

import java.util.*;

public class RemoveEvens {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 == 0)
                itr.remove();
        }
        System.out.println("After removing evens : " + list);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// RemoveEvens.java && java RemoveEvens && del RemoveEvens.class
// After removing evens : [1, 3, 5]