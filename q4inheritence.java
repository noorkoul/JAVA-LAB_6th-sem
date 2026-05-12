class BankAccount {
    String accountNumber;
    double balance;
    double interestRate;

    void deposit(double amount) {
        balance = balance + amount;

        System.out.println("Amount deposited: " + amount);
        System.out.println("New balance: " + balance);
    }
}

class savingsAccount extends BankAccount {
    double minimumBalance;

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount withdrawed: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Withdraw failed. Minimum balance required!!");
        }
    }
}

public class q4inheritence {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.accountNumber = "BA1457";
        ba.balance = 90000;
        ba.interestRate = 5;

        ba.deposit(1000);

        System.out.println();

        savingsAccount sa = new savingsAccount();
        sa.accountNumber = "JK671457";
        sa.balance = 9000;
        sa.interestRate = 4;
        sa.minimumBalance = 5000;

        sa.deposit(1000);
        sa.withdraw(4000);

    }

}
