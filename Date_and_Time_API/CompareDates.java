import java.time.LocalDate;
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first date (yyyy-MM-dd) : ");
        LocalDate d1 = LocalDate.parse(sc.next());

        System.out.println("Enter second date (yyyy-MM-dd) : ");
        LocalDate d2 = LocalDate.parse(sc.next());

        if (d1.isBefore(d2))
            System.out.println(d1 + " is before " + d2);
        else if (d1.isAfter(d2))
            System.out.println(d1 + " is after " + d2);
        else
            System.out.println(d1 + " is equal to " + d2);
    }
}

// Enter first date (yyyy-MM-dd) :
// 2004-09-06
// Enter second date (yyyy-MM-dd) :
// 2002-12-12
// 2004-09-06 is after 2002-12-12