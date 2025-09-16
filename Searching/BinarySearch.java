import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Arrays.sort(arr);
        if (binarySearch(arr, key) != -1) {
            System.out.println("found at : " + binarySearch(arr, key));
        } else {
            System.out.println("element not found");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}

// e:\Karan_codes\Java\cogPrac\Searching>cd
// "e:\Karan_codes\Java\cogPrac\Searching\" && javac BinarySearch.java && java
// BinarySearch && del BinarySearch.class
// 5
// 1 2 3 5 4
// 2
// found at : 1

// e:\Karan_codes\Java\cogPrac\Searching>cd
// "e:\Karan_codes\Java\cogPrac\Searching\" && javac BinarySearch.java && java
// BinarySearch && del BinarySearch.class
// 5
// 1 2 3 5 4
// 5
// found at : 4
