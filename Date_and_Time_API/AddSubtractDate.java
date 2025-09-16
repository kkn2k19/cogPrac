import java.time.LocalDate;

public class AddSubtractDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate plus7 = today.plusDays(7);
        LocalDate minus1month = today.minusMonths(1);

        System.out.println("Today : " + today);
        System.out.println("7 days later : " + plus7);
        System.out.println("1 month ago : " + minus1month);
    }
}

// Today : 2025-09-11
// 7 days later : 2025-09-18
// 1 month ago : 2025-08-11
