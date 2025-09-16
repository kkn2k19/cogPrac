import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSortDesc(arr);
        System.out.println("array after sorting (descending) : " + Arrays.toString(arr));
    }

    public static void insertionSortDesc(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // shift elements smaller than key to right
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}

// 5
// 1 2 3 1 2
// array after sorting (descending) : [3, 2, 2, 1, 1]