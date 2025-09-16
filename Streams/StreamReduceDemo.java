// Use reduce() to calculate product of numbers

import java.util.Arrays;
import java.util.List;

public class StreamReduceDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int product = nums.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product = " + product);
    }
}

// e:\Karan_codes\Java\cogPrac\Streams>cd "e:\Karan_codes\Java\cogPrac\Streams\"
// && javac StreamReduceDemo.java && java StreamReduceDemo && del
// StreamReduceDemo.class
// Product = 120