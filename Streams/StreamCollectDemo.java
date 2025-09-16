// Convert names to uppercase using map() + collect()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karan", "Chandan", "Saad", "Rahul", "Aamir");
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);
    }
}

// e:\Karan_codes\Java\cogPrac\Streams>cd "e:\Karan_codes\Java\cogPrac\Streams\"
// && javac StreamCollectDemo.java && java StreamCollectDemo && del
// StreamCollectDemo.class
// [KARAN, CHANDAN, SAAD, RAHUL, AAMIR]