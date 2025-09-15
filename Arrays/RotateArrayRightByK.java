import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayRightByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateRight(arr, k);
        System.out.println("Right rotated by " + k + " : " + Arrays.toString(arr));
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}

// 5
// 1 2 3 4 5
// 3
// Right rotated by 3 : [3, 4, 5, 1, 2] 