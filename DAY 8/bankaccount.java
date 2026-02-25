class BankAccount {
    String accountHolderName;
    double balance;

    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
    }
}
public class TestBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 5000);

        try {
            acc.withdraw(6000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
