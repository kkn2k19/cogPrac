import java.util.Optional;

class HeavyObject {
    HeavyObject() {
        System.out.println("Heavy object created");
    }

    public String toString() {
        return "HeavyObject";
    }
}

public class OrElseVsOrElseGet {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello");

        // orElse -> always creates object
        String value1 = opt.orElse(new HeavyObject().toString());

        // orElseGet -> created only when needed
        String value2 = opt.orElseGet(() -> new HeavyObject().toString());

        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);
    }
}

// e:\Karan_codes\Java\cogPrac\OptionalClass>cd
// "e:\Karan_codes\Java\cogPrac\OptionalClass\" && javac OrElseVsOrElseGet.java
// && java OrElseVsOrElseGet && del OrElseVsOrElseGet.class
// Heavy object created
// Value1: Hello
// Value2: Hello