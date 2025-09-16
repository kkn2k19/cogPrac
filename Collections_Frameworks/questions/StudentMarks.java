// Student marks lookup: roll → marks, then fetch by roll.

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<Integer, Integer> marks = new HashMap<>();
        marks.put(101, 85);
        marks.put(102, 90);
        marks.put(103, 76);

        int roll = 102;
        System.out.println("Marks of Roll " + roll + " = " + marks.get(roll));
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// StudentMarks.java && java StudentMarks && del StudentMarks.class
// Marks of Roll 102 = 90