import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo {
    public static void main(String[] args) {
        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);

        // LocalDate
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // methods --
        // add/ subtract days, months, years
        LocalDate futureDate = today.plusDays(7);
        LocalDate pastDate = today.minusMonths(1);
        System.out.println("7 days later: " + futureDate);
        System.out.println("1 month ago: " + pastDate);

        // compare Dates
        LocalDate independenceDay = LocalDate.of(1947, 8, 15);
        System.out.println("Is today before 15-aug-1947? " + today.isBefore(independenceDay));
        System.out.println("Is today after 15-aug-1947? " + today.isAfter(independenceDay));

        // get day of week
        System.out.println("day of week on 15-aug-1947: " + independenceDay.getDayOfWeek());

        // leap year check
        System.out.println("Is current year a leap year? " + today.isLeapYear());

        // period between dates (difference in years, months, days)
        Period diff = Period.between(independenceDay, today);
        System.out.println("Difference since 15-aug-1947: "
                + diff.getYears() + " years, "
                + diff.getMonths() + " months, "
                + diff.getDays() + " days");
    }
}

// Current Time: 15:22:25.453690900
// Current DateTime: 2025-09-11T15:22:25.456200
// Today's Date: 2025-09-11
// 7 days later: 2025-09-18
// 1 month ago: 2025-08-11
// Is today before 15-aug-1947? false
// Is today after 15-aug-1947? true
// day of week on 15-aug-1947: FRIDAY
// Is current year a leap year? false
// Difference since 15-aug-1947: 78 years, 0 months, 27 days