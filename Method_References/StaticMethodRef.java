@FunctionalInterface
interface MyPrinter {
    void print(String msg);
}

public class StaticMethodRef {
    public static void showMessage(String msg) {
        System.out.println("Message : " + msg);
    }

    public static void main(String[] args) {
        MyPrinter ref = StaticMethodRef::showMessage;
        ref.print("Hello from static method reference!");
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\Method_References\" &&
// javac StaticMethodRef.java && java StaticMethodRef && del
// StaticMethodRef.class
// Message : Hello from static method reference!