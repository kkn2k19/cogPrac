import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i<=b; i++){
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
