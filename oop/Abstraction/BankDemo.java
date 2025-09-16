abstract class Bank {
    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SBI extends Bank {
    private double balance = 0;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in SBI. Balance: ₹" + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from SBI. Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance in SBI account!");
        }
    }
}

class HDFC extends Bank {
    private double balance = 0;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in HDFC. Balance: ₹" + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from HDFC. Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance in HDFC account!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.deposit(5000);
        b1.withdraw(2000);

        Bank b2 = new HDFC();
        b2.deposit(10000);
        b2.withdraw(12000); // should fail due to insufficient balance
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Abstraction>cd
// "e:\Karan_codes\Java\cogPrac\oop\Abstraction\" && javac BankDemo.java && java
// BankDemo && del BankDemo.class
// Deposited ?5000.0 in SBI. Balance: ?5000.0
// Withdrew ?2000.0 from SBI. Balance: ?3000.0
// Deposited ?10000.0 in HDFC. Balance: ?10000.0
// Insufficient balance in HDFC account!