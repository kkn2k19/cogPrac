class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0 && salary <= 100000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Must be between 1 and 100000");
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Karan");
        emp.setSalary(120000); // invalid
        emp.setSalary(40000);

        System.out.println("Employee : " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Encapsulation>cd
// "e:\Karan_codes\Java\cogPrac\oop\Encapsulation\" && javac EmployeeDemo.java
// && java EmployeeDemo && del EmployeeDemo.class

// Invalid Salary! Must be between 1 and 100000
// Employee : Karan
// Salary : 40000.0