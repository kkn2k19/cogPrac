// Traverse an ArrayList using Iterator.

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// IteratorDemo.java && java IteratorDemo && del IteratorDemo.class
// A B C