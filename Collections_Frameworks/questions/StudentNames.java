// Store and print 5 student names using ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }
        System.out.print("Student Names : ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}

// E:\Karan_codes\Java>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// StudentNames.java && java StudentNames && del StudentNames.class
// Karan
// OM
// Rahul
// Aamir
// Saad
// Student Names : Karan OM Rahul Aamir Saad