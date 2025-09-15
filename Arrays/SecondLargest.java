import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("second largest : " + secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < max)
                return arr[i];
        }
        return -1;
    }
}

// e:\Karan_codes\Java\cogPrac\Arrays>cd "e:\Karan_codes\Java\cogPrac\Arrays\"
// && javac SecondLargest.java && java SecondLargest && del SecondLargest.class
// 5
// -1 -2 -5 -9 0
// second largest : -1

// e:\Karan_codes\Java\cogPrac\Arrays>cd "e:\Karan_codes\Java\cogPrac\Arrays\"
// && javac SecondLargest.java && java SecondLargest && del SecondLargest.class
// 5
// 1 5 4 3 2
// second largest : 4

// e:\Karan_codes\Java\cogPrac\Arrays>cd "e:\Karan_codes\Java\cogPrac\Arrays\"
// && javac SecondLargest.java && java SecondLargest && del SecondLargest.class
// 5
// -1 -5 0 3 7
// second largest : 3