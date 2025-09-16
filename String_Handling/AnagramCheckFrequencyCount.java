import java.util.Scanner;

public class AnagramCheckFrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
            return;
        }

        int[] freq = new int[26];
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        for (char ch : s2.toCharArray()) {
            freq[ch - 'a'] -= 1;
        }
        for (int f : freq) {
            if (f != 0) {
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}
