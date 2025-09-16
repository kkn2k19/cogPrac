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
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Karan");
        emp.setSalary(50000);

        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Employee Salary : " + emp.getSalary());
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\oop\Encapsulation\" &&
// javac EncapsulationDemo.java && java EncapsulationDemo && del
// EncapsulationDemo.class
// Employee Name : Karan 
// Employee Salary : 50000.0