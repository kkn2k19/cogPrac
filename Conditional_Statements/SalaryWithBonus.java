import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        double bonus;

        if (sal > 30000) {
            if (sal > 100000)
                bonus = sal * 0.20;
            else
                bonus = sal * 0.10;
        } else {
            bonus = sal * 0.05;
        }

        System.out.println("Salary: " + sal);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (sal + bonus));
    }
}
