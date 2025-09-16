public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Exception_Handling>cd
// "e:\Karan_codes\Java\cogPrac\Exception_Handling\" && javac
// MultipleCatchDemo.java && java MultipleCatchDemo && del
// MultipleCatchDemo.class
// Null Pointer Exception