import java.util.Scanner;

public class FirstLastOccurenceofKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        firstLastOccurence(arr, key);
    }

    public static void firstLastOccurence(int[] arr, int key) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                last = i;
                if (first == -1)
                    first = i;
            }
        }
        System.out.println("first occurrence at : " + first);
        System.out.println("last occurrence at : " + last);
    }
}

// e:\Karan_codes\Java\cogPrac\Searching>cd
// "e:\Karan_codes\Java\cogPrac\Searching\" && javac
// FirstLastOccurenceofKey.java && java FirstLastOccurenceofKey && del
// FirstLastOccurenceofKey.class
// 5
// 1 2 1 3 2
// 1
// first occurrence at : 0
// last occurrence at : 2

// e:\Karan_codes\Java\cogPrac\Searching>cd
// "e:\Karan_codes\Java\cogPrac\Searching\" && javac
// FirstLastOccurenceofKey.java && java FirstLastOccurenceofKey && del
// FirstLastOccurenceofKey.class
// 5
// 1 2 1 3 2
// 2
// first occurrence at : 1
// last occurrence at : 4