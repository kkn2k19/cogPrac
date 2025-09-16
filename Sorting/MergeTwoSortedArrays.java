import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                k += 1;
                i += 1;
            } else {
                merged[k] = arr2[j];
                k += 1;
                j += 1;
            }
        }

        while (i < n1) {
            merged[k] = arr1[i];
            k += 1;
            i += 1;
        }

        while (j < n2) {
            merged[k] = arr2[j];
            k += 1;
            j += 1;
        }

        return merged;
    }
}

// Merged Array: [1, 2, 3, 4, 5, 6, 7, 8]