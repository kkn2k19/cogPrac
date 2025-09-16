import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // System.out.println(map);
        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}


// karankumarnonia
// a -> 4
// r -> 2
// u -> 1
// i -> 1
// k -> 2
// m -> 1
// n -> 3
// o -> 1