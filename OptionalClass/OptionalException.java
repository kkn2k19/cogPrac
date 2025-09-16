import java.util.Optional;

public class OptionalException {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();

        String val = opt.orElseThrow(() -> new RuntimeException("Value not found!"));
        System.out.println(val);
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\OptionalClass\" && javac OptionalException.java && java OptionalException && del OptionalException.class
// Exception in thread "main" java.lang.RuntimeException: Value not found!
//         at OptionalException.lambda$main$0(OptionalException.java:7)
//         at java.base/java.util.Optional.orElseThrow(Optional.java:403)
//         at OptionalException.main(OptionalException.java:7)