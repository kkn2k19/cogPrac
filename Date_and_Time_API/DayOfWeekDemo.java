import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DayOfWeek day = today.getDayOfWeek();
        System.out.println("Day of week : " + day);
    }
}

// Day of week : THURSDAY