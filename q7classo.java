import java.util.Scanner;

class BankAccount {

    int accountNo;
    double balance;
    double transactionLimit;

    // Deposit
    void deposit(double amount) {

        if (amount <= transactionLimit) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Deposit exceeds transaction limit.");
        }
    }

    // Withdraw
    void withdraw(double amount) {

        if (amount > transactionLimit) {
            System.out.println("Withdrawal exceeds transaction limit.");
        } else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
            balance = balance - 100;     // Penalty
            System.out.println("Penalty of Rs.100 Applied.");
        }
    }

    // Monthly Interest
    void interest() {

        double interest = balance * 0.05;

        balance = balance + interest;

        System.out.println("Monthly Interest = " + interest);
    }

    // Display Balance
    void display() {

        System.out.println("Current Balance = " + balance);
    }
}

public class q7classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        acc.accountNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();

        System.out.print("Enter Transaction Limit: ");
        acc.transactionLimit = sc.nextDouble();

        // Deposit
        System.out.print("\nEnter Deposit Amount: ");
        double deposit = sc.nextDouble();

        acc.deposit(deposit);

        // Withdrawal
        System.out.print("\nEnter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        acc.withdraw(withdraw);

        // Interest
        acc.interest();

        // Display Final Balance
        acc.display();

        sc.close();
    }
}