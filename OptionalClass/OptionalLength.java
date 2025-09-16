import java.util.Optional;

public class OptionalLength {
    public static void main(String[] args) {
        String str = "karan";

        int len = Optional.ofNullable(str)
                .map(String::length)
                .orElse(0);

        System.out.println("Length : " + len);
    }
}

// e:\Karan_codes\Java\cogPrac\OptionalClass>cd
// "e:\Karan_codes\Java\cogPrac\OptionalClass\" && javac OptionalLength.java &&
// java OptionalLength && del OptionalLength.class
// Length : 5