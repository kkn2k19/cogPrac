// use filter() to find all strings starting with "A"

import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karan", "Chandan", "Saad", "Rahul", "Aamir", "Ankit", "Mazhar", "Ritesh",
                "Shadaf", "Om", "Saqib", "Priyanshu", "Sumit", "Himadri", "Rabin", "Sarthak");
        names.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}

// e:\Karan_codes\Java\cogPrac\Streams>cd "e:\Karan_codes\Java\cogPrac\Streams\"
// && javac StreamFilterDemo.java && java StreamFilterDemo && del
// StreamFilterDemo.class
// Aamir
// Ankit