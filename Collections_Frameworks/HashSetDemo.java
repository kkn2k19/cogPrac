import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate ignored -- returns 0 when not added can use in many case where
                          // duplicate find cases given

        System.out.println(set);

        // check existence
        System.out.println("Contains Banana ? " + set.contains("Banana"));

        // Iteration
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\" && javac
// HashSetDemo.java && java HashSetDemo && del HashSetDemo.class
// [Apple, Orange, Banana]
// Contains Banana ? true
// Apple
// Orange
// Banana