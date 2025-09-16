import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> otpSupplier = () -> new Random().nextInt(900000) + 100000;

        System.out.println("Generated OTP : " + otpSupplier.get());
        System.out.println("Generated OTP : " + otpSupplier.get());
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// SupplierDemo.java && java SupplierDemo && del SupplierDemo.class
// Generated OTP : 244744
// Generated OTP : 757417