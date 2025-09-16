import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurrenceBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Arrays.sort(arr);
        if (firstOccurrence(arr, key) != -1) {
            System.out.println("found first at in sorted arr : " + firstOccurrence(arr, key));
        } else {
            System.out.println("element not found");
        }
    }

    public static int firstOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }
}

// 5
// 1 2 1 2 1
// 2
// found first at in sorted arr : 3