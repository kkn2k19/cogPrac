import java.util.HashMap;
import java.util.Scanner;

public class FreqCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        System.out.println("Frequency : --");
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

// 5
// 1 2 1 2 3
// Frequency : --
// 1 -> 2
// 2 -> 2
// 3 -> 1