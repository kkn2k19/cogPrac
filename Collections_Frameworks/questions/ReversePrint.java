// Reverse print an ArrayList using ListIterator.

import java.util.*;

public class ReversePrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        ListIterator<String> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// ReversePrint.java && java ReversePrint && del ReversePrint.class
// Three Two One