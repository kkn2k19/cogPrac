import java.util.Scanner;

public class FirstPrimeBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        primesInRange(a, b);
    }

    public static void primesInRange(int start, int end) {
        boolean found = false;
        while (start <= end) {
            if (isPrime(start)) {
                System.out.print("First prime : " + start);
                found = true;
                break;
            }
            start += 1;
        }
        if (!found)
            System.out.println("No prime in range");
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
