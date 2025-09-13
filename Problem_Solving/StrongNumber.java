import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStrong(n));
    }

    public static boolean isStrong(int n){
        int sum = 0;
        int i = n;
        while (i > 0){
            sum += factorial(i%10);
            i /= 10;
        }
        if (sum == n) return true;
        return false;
    }

    public static int factorial(int n){
        if (n <= 1) return 1;
        return n*factorial(n-1);
    }
}
