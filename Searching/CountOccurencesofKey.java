import java.util.Scanner;

public class CountOccurencesofKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(countOccurence(arr, key));
    }

    public static int countOccurence(int[] arr, int key) {
        int count = 0;
        for (int val : arr) {
            if (val == key)
                count += 1;
        }
        return count;
    }
}

// 5
// 1 2 3 2 2
// 2
// 3