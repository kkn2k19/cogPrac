import java.util.Scanner;

public class FactorialSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factSum(n));
    }

    public static int factSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fact(i);
        }
        return sum;
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
