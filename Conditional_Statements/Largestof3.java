import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("all equal");
        else if (a > b && a > c)
            System.out.println(a + " is greatet");
        else if (b > c && b > a)
            System.out.println(b + " is greatet");
        else if (c > a && c > b)
            System.out.println(c + " is greatest");
    }
}
