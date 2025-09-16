import java.util.Optional;

public class OptionalUpper {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("karan");
        String res = opt.map(String::toUpperCase)
                .orElse("No value");
        System.out.println(res);
    }
}

// e:\Karan_codes\Java\cogPrac\OptionalClass>cd
// "e:\Karan_codes\Java\cogPrac\OptionalClass\" && javac OptionalUpper.java &&
// java OptionalUpper && del OptionalUpper.class
// KARAN
