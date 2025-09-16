import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        list.add(1);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removals : " + list);

        // list.remove(); // removes from first
        // System.out.println("After removals : " + list);

    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\"
// && javac LinkedListDemo.java && java LinkedListDemo && del
// LinkedListDemo.class
// [5, 10, 20, 30, 1]
// [1, 5, 10, 20, 30]
// After removals : [5, 10, 20]
