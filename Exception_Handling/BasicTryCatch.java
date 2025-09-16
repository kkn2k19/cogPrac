// Handle ArithmeticException (divide by zero).

public class BasicTryCatch {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            // System.out.println(e); // java.lang.ArithmeticException: / by zero
            System.out.println("Error : Division by zero not allowed");
        }
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\Exception_Handling\" &&
// javac BasicTryCatch.java && java BasicTryCatch && del BasicTryCatch.class
// Error : Division by zero not allowed