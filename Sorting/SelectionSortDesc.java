import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSortDesc(arr);
        System.out.println("array after sorting (descending) : " + Arrays.toString(arr));
    }

    public static void selectionSortDesc(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int maxIndex = i;

            // find index of max ele
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

// 5
// 1 2 3 5 4
// array after sorting (descending) : [5, 4, 3, 2, 1]