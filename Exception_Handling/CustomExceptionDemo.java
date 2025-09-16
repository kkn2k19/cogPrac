class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        }
        System.out.println("valid age");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeException e) {
            System.out.println("Caught Exception : " + e.getMessage());
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Exception_Handling>cd
// "e:\Karan_codes\Java\cogPrac\Exception_Handling\" && javac
// CustomExceptionDemo.java && java CustomExceptionDemo && del
// CustomExceptionDemo.class
// Caught Exception : Age must be 18 or above