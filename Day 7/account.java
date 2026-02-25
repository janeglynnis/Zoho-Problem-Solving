
class Account {
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }
}
class SavingsAccount extends Account {
    void interest() {
        System.out.println("Savings interest added");
    }
}
class CurrentAccount extends Account {
    void overdraft() {
        System.out.println("Overdraft facility available");
    }
}
class acctypeinheritance {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(1000);
        s.interest();

        CurrentAccount c = new CurrentAccount();
        c.deposit(2000);
        c.overdraft();
    }
}
