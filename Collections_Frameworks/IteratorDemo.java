import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int n = itr.next();
            if (n % 2 != 0)
                itr.remove();
        }
        System.out.println(list); // [2,4]
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\" && javac
// IteratorDemo.java && java IteratorDemo && del IteratorDemo.class
// [2, 4]