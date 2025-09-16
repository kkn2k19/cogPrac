import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start date (yyyy-MM-dd) : ");
        LocalDate d1 = LocalDate.parse(sc.next());

        System.out.println("Enter end date (yyyy-MM-dd) : ");
        LocalDate d2 = LocalDate.parse(sc.next());

        Period diff = Period.between(d1, d2);

        System.out.println("Difference : "
                + diff.getYears() + " years, "
                + diff.getMonths() + " months, "
                + diff.getDays() + " days");
    }
}

// Enter start date (yyyy-MM-dd) :
// 2004-01-01
// Enter end date (yyyy-MM-dd) :
// 2004-09-06
// Difference : 0 years, 8 months, 5 days