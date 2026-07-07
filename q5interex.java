import java.util.Scanner;

// Interface
interface Account {

    void deposit();

    void withdraw();

    void balanceInquiry();
}

// Class implementing the interface
class SavingsAccount implements Account {

    double balance;
    Scanner sc = new Scanner(System.in);

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit() {

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        balance = balance + amount;

        System.out.println("Amount Deposited Successfully.");
        System.out.println("Current Balance = Rs. " + balance);
    }

    @Override
    public void withdraw() {

        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }

        System.out.println("Current Balance = Rs. " + balance);
    }

    @Override
    public void balanceInquiry() {

        System.out.println("Current Balance = Rs. " + balance);
    }
}

// Main Class
public class q5interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account account = new SavingsAccount(initialBalance); // Runtime Polymorphism

        int choice;

        do {

            System.out.println("\n===== Savings Account Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.deposit();
                    break;

                case 2:
                    account.withdraw();
                    break;

                case 3:
                    account.balanceInquiry();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}