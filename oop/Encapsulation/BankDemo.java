class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw amount : " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(500);
        System.out.println("current balance : " + acc.getBalance());
    }
}

// Deposited : 1000.0
// withdraw amount : 500.0
// current balance : 500.0