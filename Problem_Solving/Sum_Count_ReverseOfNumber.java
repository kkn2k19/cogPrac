import java.util.Scanner;

public class Sum_Count_ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of digits : " + sumofdigits(n));
        System.out.println("Digits Count : " + countDigits(n));
        System.out.println("Reverse : " + rev(n));
    }

    public static int sumofdigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c += 1;
            n /= 10;
        }
        return c;
    }

    public static int rev(int n){
        int r = 0;
        while (n > 0){
            r = 10*r + (n % 10);
            n /= 10;
        }
        return r;
    }
}
