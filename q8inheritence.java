import java.util.Scanner;

// Parent Class
class BankAccount {

    int accountNumber;
    double balance;
    double interestRate;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited = " + amount);
        System.out.println("Balance = " + balance);
    }
}

// Child Class
class SavingsAccount extends BankAccount {

    double minimumBalance;

    void withdraw(double amount) {

        if (balance - amount >= minimumBalance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn = " + amount);
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Cannot Withdraw. Minimum Balance must be maintained.");
        }
    }
}

// Grandchild Class
class FixedDepositAccount extends SavingsAccount {

    int term;

    double getInterest() {
        return (balance * interestRate * term) / 100;
    }
}

public class q8inheritence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // BankAccount Object
        BankAccount b = new BankAccount();

        System.out.print("Enter Account Number: ");
        b.accountNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        b.balance = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        b.interestRate = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();

        b.deposit(dep);

        // SavingsAccount Object
        SavingsAccount s = new SavingsAccount();

        s.balance = b.balance;
        s.minimumBalance = 1000;

        System.out.print("\nEnter Withdrawal Amount: ");
        double w = sc.nextDouble();

        s.withdraw(w);

        // FixedDepositAccount Object
        FixedDepositAccount f = new FixedDepositAccount();

        f.balance = s.balance;
        f.interestRate = b.interestRate;

        System.out.print("\nEnter Term (Years): ");
        f.term = sc.nextInt();

        System.out.println("Interest Earned = " + f.getInterest());

        sc.close();
    }
}