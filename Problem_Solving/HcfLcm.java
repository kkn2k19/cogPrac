import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF : " + hcf(a, b));
        System.out.println("LCM : " + (a * b) / hcf(a, b));
    }

    public static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }
}