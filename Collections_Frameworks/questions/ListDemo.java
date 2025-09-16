// Show difference between ArrayList and LinkedList with example.

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("A");
        arrayList.add("B");

        linkedList.add("X");
        linkedList.add("Y");

        System.out.println("ArrayList : " + arrayList); // faster random access
        System.out.println("LinkedList : " + linkedList); // faster insertion/deletion
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// ListDemo.java && java ListDemo && del ListDemo.class
// ArrayList : [A, B]
// LinkedList : [X, Y]
