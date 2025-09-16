// Q3. Use Supplier to generate a random OTP (6-digit).

import java.util.Random;
import java.util.function.Supplier;

public class SupplierOTPDemo {
    public static void main(String[] args) {
        Supplier<Integer> otp = () -> new Random().nextInt(900000) + 100000;

        System.out.println("OTP : " + otp.get());
    }
}

// e:\Karan_codes\Java\cogPrac\Functional_Programming>cd
// "e:\Karan_codes\Java\cogPrac\Functional_Programming\" && javac
// SupplierOTPDemo.java && java SupplierOTPDemo && del SupplierOTPDemo.class
// OTP : 164664