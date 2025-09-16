// Show how HashSet prevents duplicates (with custom object & equals/hashCode).

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id; // based on id
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, "karan"));
        set.add(new Student(2, "chandan"));
        set.add(new Student(1, "karan kumar")); // wont be added - duplicate
        System.out.println(set);
    }
}

// e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions>cd
// "e:\Karan_codes\Java\cogPrac\Collections_Frameworks\questions\" && javac
// HashSetDemo.java && java HashSetDemo && del HashSetDemo.class
// [1 - karan, 2 - chandan]