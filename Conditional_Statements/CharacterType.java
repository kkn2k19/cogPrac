import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (Character.isDigit(ch))
            System.out.println("digit");
        else if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase Alphabet.");
            } else {
                System.out.println("Lowercase Alphabet.");
            }
        } else
            System.out.println("special character");
    }
}
