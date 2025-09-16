import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(x);
                x += 1;
            }
            System.out.println();
        }
    }
}

// 4
// 1
// 12
// 123
// 1234