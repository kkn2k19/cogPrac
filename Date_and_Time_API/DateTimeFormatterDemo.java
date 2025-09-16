import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println(today.format(f1));
        System.out.println(today.format(f2));
        System.out.println(today.format(f3));
    }
}

// e:\Karan_codes\Java\cogPrac\Date_and_Time_API>javac
// DateTimeFormatterDemo.java && java DateTimeFormatterDemo && del
// DateTimeFormatterDemo.class
// 11-09-2025
// 2025/09/11
// 11-Sep-2025
