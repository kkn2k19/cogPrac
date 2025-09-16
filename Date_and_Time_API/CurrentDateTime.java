import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date : " + date);
        System.out.println("Current Time : " + time);
        System.out.println("Current DateTime : " + dateTime);
    }
}

// Current Date : 2025-09-11
// Current Time : 18:49:08.730491500
// Current DateTime : 2025-09-11T18:49:08.730491500