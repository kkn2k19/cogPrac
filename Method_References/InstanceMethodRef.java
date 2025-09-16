import java.util.function.Consumer;

public class InstanceMethodRef {
    public void printMsg() {
        System.out.println("Instance says: Hello Runnable");
    }

    public void printMsg(String msg) {
        System.out.println("Instance says: " + msg);
    }

    public static void main(String[] args) {
        InstanceMethodRef obj = new InstanceMethodRef();
        Runnable r = obj::printMsg; // Runnable’s run() → no args
        r.run(); // prints: Instance says: null

        // Correct: method reference matches Consumer<String>.accept(String)
        Consumer<String> consumer = obj::printMsg;
        consumer.accept("Hello, Karan!");
    }
}

// e:\Karan_codes\Java\cogPrac\Method_References>cd
// "e:\Karan_codes\Java\cogPrac\Method_References\" && javac
// InstanceMethodRef.java && java InstanceMethodRef && del
// InstanceMethodRef.class
// Instance says: Hello Runnable
// Instance says: Hello, Karan!