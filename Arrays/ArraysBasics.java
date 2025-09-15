import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaration
        int[] arr;
        // memory allocation
        arr = new int[5];

        // initialization
        int[] arr1 = { 10, 20, 30, 40, 50 };
        arr1[2] = 35; // updated ele at index 2

        // traversal
        // using normal for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // using enhanced for loop (for-each)
        for (int val : arr1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

// e:\Karan_codes\Java\cogPrac\Arrays>cd "e:\Karan_codes\Java\cogPrac\Arrays\"
// && javac ArraysBasics.java && java ArraysBasics && del ArraysBasics.class

// 10 20 35 40 50
// 10 20 35 40 50