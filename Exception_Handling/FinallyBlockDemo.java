public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Exception_Handling>cd
// "e:\Karan_codes\Java\cogPrac\Exception_Handling\" && javac
// FinallyBlockDemo.java && java FinallyBlockDemo && del FinallyBlockDemo.class
// Arithmetic Exception caught
// Finally block always executes 