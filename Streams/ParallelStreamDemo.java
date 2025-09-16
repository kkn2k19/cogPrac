import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // stream()
        System.out.println("Sequential:");
        nums.stream()
                .forEach(System.out::println);

        // parallelStream()
        System.out.println("Parallel:");
        nums.parallelStream()
                .forEach(System.out::println);
        // order may be different
    }
}

// e:\Karan_codes\Java\cogPrac\Streams>cd "e:\Karan_codes\Java\cogPrac\Streams\"
// && javac ParallelStreamDemo.java && java ParallelStreamDemo && del
// ParallelStreamDemo.class
// Sequential:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// Parallel:
// 6
// 5
// 8
// 9
// 4
// 3
// 7
// 2
// 1
