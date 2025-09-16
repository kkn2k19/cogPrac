// Group names by length using groupingBy()

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupByDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karan", "Chandan", "Saad", "Rahul", "Aamir", "Ankit", "Mazhar", "Ritesh",
                "Shadaf", "Om", "Saqib", "Priyanshu", "Sumit", "Himadri", "Rabin", "Sarthak");
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}

// e:\Karan_codes\Java\cogPrac\Streams>cd "e:\Karan_codes\Java\cogPrac\Streams\"
// && javac StreamGroupByDemo.java && java StreamGroupByDemo && del
// StreamGroupByDemo.class
// {
// 2=[Om],
// 4=[Saad],
// 5=[Karan, Rahul, Aamir, Ankit, Saqib, Sumit, Rabin],
// 6=[Mazhar, Ritesh, Shadaf],
// 7=[Chandan, Himadri, Sarthak],
// 9=[Priyanshu]
// }
