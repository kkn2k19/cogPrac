import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("eligible for voting and driving license");
        else if (age >= 16)
            System.out.println("eligible for some jobs, not for voting");
        else
            System.out.println("not eligible for voting or driving license");
    }
}
