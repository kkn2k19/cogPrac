// use map() to square all numbers in a list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\Streams\" && javac
// StreamMapDemo.java && java StreamMapDemo && del StreamMapDemo.class
// [1, 4, 9, 16, 25]