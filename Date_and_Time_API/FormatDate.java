import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println("dd-MM-yyyy :" + today.format(f1));
        System.out.println("yyyy/MM/dd :" + today.format(f2));
        System.out.println("dd-MMM-yyyy :" + today.format(f3));
    }
}

// dd-MM-yyyy :11-09-2025
// yyyy/MM/dd :2025/09/11
// dd-MMM-yyyy :11-Sep-2025