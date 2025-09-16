import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
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
