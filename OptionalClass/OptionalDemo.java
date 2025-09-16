import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Karan");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();

        System.out.println("opt1: " + opt1.get());
        System.out.println("opt2 present? " + opt2.isPresent());
        System.out.println("opt3 present? " + opt3.isPresent());
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\OptionalClass\" && javac
// OptionalDemo.java && java OptionalDemo && del OptionalDemo.class
// opt1: Karan
// opt2 present? false
// opt3 present? false