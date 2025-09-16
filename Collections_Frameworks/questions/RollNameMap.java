// Store student roll-number → name mapping in HashMap and print it.

import java.util.*;

public class RollNameMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Karan");
        map.put(2, "Rishi");
        map.put(3, "Om");

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// RollNameMap.java && java RollNameMap && del RollNameMap.class
// 1 -> Karan
// 2 -> Rishi
// 3 -> Om