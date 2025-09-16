import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysLeftInYear {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDay = LocalDate.of(today.getYear(), 12, 31);

        long daysLeft = ChronoUnit.DAYS.between(today, lastDay);

        System.out.println("Today : " + today);
        System.out.println("Days left in this year : " + daysLeft);
    }
}

// Today : 2025-09-11
// Days left in this year : 111