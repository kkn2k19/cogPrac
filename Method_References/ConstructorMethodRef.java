import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student object created!");
    }
}

public class ConstructorMethodRef {
    public static void main(String[] args) {
        Supplier<Student> sup = Student::new;
        Student s = sup.get(); // creates Student object
    }
}

// e:\Karan_codes\Java\cogPrac\Method_References>cd
// "e:\Karan_codes\Java\cogPrac\Method_References\" && javac
// ConstructorMethodRef.java && java ConstructorMethodRef && del
// ConstructorMethodRef.class
// Student object created!