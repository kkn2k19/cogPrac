import java.util.Scanner;

public class ArmstrongNumber_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n){
        int digits = countDigits(n);
        int sum = 0;
        int i = n;
        while (i > 0){
            int d = i % 10;
            sum += (int)Math.pow(d, digits);
            i /= 10;
        }
        return sum==n;
    }

    public static int countDigits(int n){
        int count = 0;
        while (n > 0){
            count += 1;
            n /= 10;
        }
        return count;
    }
}
