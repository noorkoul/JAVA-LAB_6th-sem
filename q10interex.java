import java.util.InputMismatchException;
import java.util.Scanner;

// Interface
interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    void checkBalance();
}

// Class implementing interface
class BankAccount implements Account {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Deposit Amount.");
        }

        balance += amount;

        System.out.println("Deposit Successful.");
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Withdrawal Amount.");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance.");
        }

        balance -= amount;

        System.out.println("Withdrawal Successful.");
    }

    @Override
    public void checkBalance() {

        System.out.println("Current Balance = Rs. " + balance);
    }
}

// Main Class
public class q10interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new BankAccount(balance);

        int choice;

        do {

            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Deposit Amount: ");
                        double deposit = sc.nextDouble();

                        account.deposit(deposit);

                        break;

                    case 2:

                        System.out.print("Enter Withdrawal Amount: ");
                        double withdraw = sc.nextDouble();

                        account.withdraw(withdraw);

                        break;

                    case 3:

                        account.checkBalance();

                        break;

                    case 4:

                        System.out.println("Thank You!");
                        break;

                    default:

                        System.out.println("Invalid Choice.");
                }

            } catch (IllegalArgumentException | ArithmeticException e) {

                System.out.println(e.getMessage());

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input.");
                sc.nextLine();
            }

        } while (choice != 4);

        sc.close();
    }
}