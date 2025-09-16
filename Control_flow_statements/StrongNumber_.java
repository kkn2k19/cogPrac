import java.util.Scanner;

public class StrongNumber_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStrong(n));
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int i = n;
        while (i > 0) {
            int d = i % 10;
            sum += fact(d);
            i /= 10;
        }
        return sum == n;
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
