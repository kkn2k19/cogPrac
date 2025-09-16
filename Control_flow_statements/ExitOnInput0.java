import java.util.Scanner;

public class ExitOnInput0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Loop stopped");
                break;
            }
            System.out.println("Entered : " + n);
        }
    }
}

// 1
// Entered : 1
// 2
// Entered : 2
// 3
// Entered : 3
// 0
// Loop stopped