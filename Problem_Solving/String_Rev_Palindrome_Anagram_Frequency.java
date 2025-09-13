import java.util.HashMap;
import java.util.Scanner;

public class String_Rev_Palindrome_Anagram_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(rev(str));
        System.out.println(isPalindrome(str));

        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isAnagram(str1, str2));

        freqChar(str2);
    }

    public static String rev(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }

    public static boolean isPalindrome(String str) {
        String rev = rev(str);
        if (str.equals(rev))
            return true;
        else
            return false;
    }

    public static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) != 0)
                return false;
        }
        return true;
    }

    public static void freqChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
    }
}
