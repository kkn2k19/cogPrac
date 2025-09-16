import java.util.Scanner;

public class FactorialUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
