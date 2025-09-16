// Find the maximum number from an ArrayList of integers.

import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class MaxInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // int max = Collections.max(list);
        int max = list.get(0);
        for (int val : list) {
            max = Math.max(max, val);
        }

        System.out.println("Maximum = " + max);
    }
}

// E:\Karan_codes\Java>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// MaxInArrayList.java && java MaxInArrayList && del MaxInArrayList.class
// 5
// 1 3 9 8 2
// Maximum = 9