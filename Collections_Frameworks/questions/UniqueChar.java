// Count unique characters in a string (banana → {b, a, n}).

import java.util.*;

public class UniqueChar {
    public static void main(String[] args) {
        String s = "banana";
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        System.out.println("Unique characters : " + set);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// UniqueChar.java && java UniqueChar && del UniqueChar.class
// Unique characters : [a, b, n]