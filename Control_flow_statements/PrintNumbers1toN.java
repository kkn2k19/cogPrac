import java.util.Scanner;

public class PrintNumbers1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Using for loop -- ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using while loop -- ");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();

        System.out.println("Using do while loop -- ");
        int j = 1;
        do {
            System.out.print(j + " ");
            j += 1;
        } while (j <= n);
        System.out.println();
    }
}

// 10
// Using for loop --
// 1 2 3 4 5 6 7 8 9 10
// Using while loop --
// 1 2 3 4 5 6 7 8 9 10
// Using do while loop --
// 1 2 3 4 5 6 7 8 9 10