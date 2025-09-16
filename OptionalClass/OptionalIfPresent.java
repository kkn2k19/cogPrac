import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello Optional");
        opt.ifPresent(s -> System.out.println("Value : " + s));

        Optional<String> empty = Optional.empty();
        empty.ifPresent(s -> System.out.println("This won't print"));
    }
}

// e:\Karan_codes\Java\cogPrac\OptionalClass>cd
// "e:\Karan_codes\Java\cogPrac\OptionalClass\" && javac OptionalIfPresent.java
// && java OptionalIfPresent && del OptionalIfPresent.class
// Value : Hello Optional