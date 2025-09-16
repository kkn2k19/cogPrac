interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing doc");
    }

    @Override
    public void scan() {
        System.out.println("scanning doc");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Abstraction>cd
// "e:\Karan_codes\Java\cogPrac\oop\Abstraction\" && javac
// MultipleInheritanceDemo.java && java MultipleInheritanceDemo && del
// MultipleInheritanceDemo.class
// Printing doc
// scanning doc