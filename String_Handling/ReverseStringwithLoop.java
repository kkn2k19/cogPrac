import java.util.Scanner;

public class ReverseStringwithLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";

        char[] arr = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += arr[i];
        }
        System.out.println(rev);
    }
}
