class Person {
    String name;
    int age;
}

class Employee extends Person {
    double salary;
}

class Manager extends Employee {
    String dept;

    void showDetails() {
        System.out.println("Name : " + name + ", Age : " + age + ", Salary : " + salary + ", Dept : " + dept);
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Karan";
        m.age = 22;
        m.salary = 75000;
        m.dept = "IT";
        m.showDetails();
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Inheritance>cd
// "e:\Karan_codes\Java\cogPrac\oop\Inheritance\" && javac
// MultiLevelInheritanceDemo.java && java MultiLevelInheritanceDemo && del
// MultiLevelInheritanceDemo.class

// Name : Karan, Age : 22, Salary : 75000.0, Dept : IT
