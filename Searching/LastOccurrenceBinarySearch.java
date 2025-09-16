import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrenceBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Arrays.sort(arr);
        if (lastOccurrence(arr, key) != -1) {
            System.out.println("found last at in sorted arr : " + lastOccurrence(arr, key));
        } else {
            System.out.println("element not found");
        }
    }

    public static int lastOccurrence(int[] arr, int key) {
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }
}

// e:\Karan_codes\Java\cogPrac\Searching>cd
// "e:\Karan_codes\Java\cogPrac\Searching\" && javac
// LastOccurrenceBinarySearch.java && java LastOccurrenceBinarySearch && del
// LastOccurrenceBinarySearch.class
// 5
// 1 2 5 3 1
// 1
// found last at in sorted arr : 1