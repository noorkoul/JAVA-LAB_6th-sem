import java.util.Scanner;

// Superclass
class BankAccount {

    int accountNo;
    String name;
    double principal;
    int duration;

    BankAccount(int accountNo, String name, double principal, int duration) {
        this.accountNo = accountNo;
        this.name = name;
        this.principal = principal;
        this.duration = duration;
    }

    void calculateInterest() {
        System.out.println("Interest Calculation");
    }
}

// Savings Account
class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNo, String name, double principal, int duration) {
        super(accountNo, name, principal, duration);
    }

    @Override
    void calculateInterest() {

        double rate = 4;
        double interest = (principal * rate * duration) / 100;
        double maturity = principal + interest;

        System.out.println("\n------ Savings Account Statement ------");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Principal Amount : " + principal);
        System.out.println("Duration : " + duration + " years");
        System.out.println("Interest Rate : " + rate + "%");
        System.out.println("Interest Earned : " + interest);
        System.out.println("Maturity Amount : " + maturity);
    }
}

// Fixed Deposit Account
class FixedDepositAccount extends BankAccount {

    FixedDepositAccount(int accountNo, String name, double principal, int duration) {
        super(accountNo, name, principal, duration);
    }

    @Override
    void calculateInterest() {

        double rate = 7;
        double interest = (principal * rate * duration) / 100;
        double maturity = principal + interest;

        System.out.println("\n------ Fixed Deposit Account Statement ------");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Principal Amount : " + principal);
        System.out.println("Duration : " + duration + " years");
        System.out.println("Interest Rate : " + rate + "%");
        System.out.println("Interest Earned : " + interest);
        System.out.println("Maturity Amount : " + maturity);
    }
}

// Main Class
public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc;   // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Banking Application =====");
            System.out.println("1. Savings Account");
            System.out.println("2. Fixed Deposit Account");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number : ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Principal Amount : ");
                    double principal = sc.nextDouble();

                    System.out.print("Enter Duration (Years) : ");
                    int duration = sc.nextInt();

                    acc = new SavingsAccount(accNo, name, principal, duration);

                    acc.calculateInterest();

                    break;

                case 2:

                    System.out.print("Enter Account Number : ");
                    accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Principal Amount : ");
                    principal = sc.nextDouble();

                    System.out.print("Enter Duration (Years) : ");
                    duration = sc.nextInt();

                    acc = new FixedDepositAccount(accNo, name, principal, duration);

                    acc.calculateInterest();

                    break;

                case 3:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}