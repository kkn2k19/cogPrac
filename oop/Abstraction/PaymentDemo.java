interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(2500);
        p2.pay(500);
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Abstraction>cd
// "e:\Karan_codes\Java\cogPrac\oop\Abstraction\" && javac PaymentDemo.java &&
// java PaymentDemo && del PaymentDemo.class
// Paid ?2500.0 using Credit Card.
// Paid ?500.0 using UPI.
