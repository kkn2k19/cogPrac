import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        System.out.println("array after sorting (ascending) : " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftHalf = new int[n1];
        int[] rightHalf = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftHalf[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightHalf[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                k += 1;
                i += 1;
            } else {
                arr[k] = rightHalf[j];
                k += 1;
                j += 1;
            }
        }

        while (i < n1) {
            arr[k] = leftHalf[i];
            k += 1;
            i += 1;
        }

        while (j < n2) {
            arr[k] = rightHalf[j];
            k += 1;
            j += 1;
        }
    }
}

// 9
// 1 5 3 9 8 7 2 2 6
// array after sorting (ascending) : [1, 2, 2, 3, 5, 6, 7, 8, 9]