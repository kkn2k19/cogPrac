import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitsSum(n));
    }

    public static int digitsSum(int n){
        int sum =0;
        while (n > 0){
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        return sum;
    }
}
