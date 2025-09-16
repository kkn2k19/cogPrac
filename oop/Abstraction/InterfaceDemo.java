interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Report implements Printable, Scannable {
    public void print() {
        System.out.println("Printing Report");
    }

    public void scan() {
        System.out.println("Scanning Report");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Report r = new Report();
        r.print();
        r.scan();
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Abstraction>cd
// "e:\Karan_codes\Java\cogPrac\oop\Abstraction\" && javac InterfaceDemo.java &&
// java InterfaceDemo && del InterfaceDemo.class
// Printing Report
// Scanning Report
