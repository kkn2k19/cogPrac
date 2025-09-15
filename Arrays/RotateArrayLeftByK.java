import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeftByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateLeft(arr, k);
        System.out.println("Left rotated by " + k + " : " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
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

// e:\Karan_codes\Java\cogPrac\Arrays>cd "e:\Karan_codes\Java\cogPrac\Arrays\"
// && javac RotateArrayLeftByK.java && java RotateArrayLeftByK && del
// RotateArrayLeftByK.class
// 5
// 1 2 3 4 5
// 3
// Left rotated by 3 : [4, 5, 1, 2, 3]