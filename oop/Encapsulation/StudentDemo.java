class Student {
    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setName("Karan");
        s1.setMarks(88);

        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());

    }
}

// e:\Karan_codes\Java\cogPrac\oop\Encapsulation>cd
// "e:\Karan_codes\Java\cogPrac\oop\Encapsulation\" && javac StudentDemo.java &&
// java StudentDemo && del StudentDemo.class
// Roll No: 101
// Name: Karan
// Marks: 88.0