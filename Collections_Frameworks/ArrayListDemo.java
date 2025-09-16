import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // adding elements
        list.add("Karan");
        list.add("Saad");
        list.add("Aamir");
        list.add("Rahul");
        list.add("Om");

        // access by index
        System.out.println("First element : " + list.get(0));

        // remove element
        list.remove("Rahul"); // removes first occurrence
        System.out.println("After remove : " + list);

        // iteration
        for (String name : list) {
            System.out.println("Name : " + name);
        }

        // sorting
        Collections.sort(list);
        System.out.println("Sorted : " + list);
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\"
// && javac ArrayListDemo.java && java ArrayListDemo && del ArrayListDemo.class
// First element : Karan
// After remove : [Karan, Saad, Aamir, Om]
// Name : Karan
// Name : Saad
// Name : Aamir
// Name : Om
// Sorted : [Aamir, Karan, Om, Saad]