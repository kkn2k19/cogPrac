import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        if (linearSearch(arr, key) != -1) {
            System.out.println("Element found at index : " + linearSearch(arr, key));
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}

// 5
// 1 2 3 5 4
// 2
// Element found at index : 1