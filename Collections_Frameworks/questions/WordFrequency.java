// Word frequency counter (apple mango apple → {apple=2, mango=1}).

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "mango apple apple";
        String[] words = text.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// WordFrequency.java && java WordFrequency && del WordFrequency.class
// {apple=2, mango=1}