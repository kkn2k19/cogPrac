import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}

// 5
// 1 5 4 3 2
// max : 5
// min : 1