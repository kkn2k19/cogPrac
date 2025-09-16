// Find most frequent element in an array using HashMap.

import java.util.*;

public class MostFrequent {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 2, 5, 3, 3, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int maxCount = 0, mostFreq = -1;
        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mostFreq = key;
            }
        }
        System.out.println("Most frequent = " + mostFreq + " (" + maxCount + " times)");
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// MostFrequent.java && java MostFrequent && del MostFrequent.class
// Most frequent = 3 (4 times)
