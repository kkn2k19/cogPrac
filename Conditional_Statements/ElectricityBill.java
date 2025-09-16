import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0.0;

        if (units <= 100)
            bill = units * 1.5;
        else if (units <= 200)
            bill = 100 * 1.5 + (units - 100) * 2.5;
        else if (units <= 300)
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        else
            bill = 100 * 1.5 + 100 * 2.5 + 100 * 3.5 + (units - 300) * 5;

        System.out.println("Total bill : " + bill);
    }
}
