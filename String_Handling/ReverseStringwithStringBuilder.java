import java.util.Scanner;

public class ReverseStringwithStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}
