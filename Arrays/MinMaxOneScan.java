import java.util.Scanner;

public class MinMaxOneScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

// 5
// -1 -2 -5 -9 0
// Min: -9
// Max: 0