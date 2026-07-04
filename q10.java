import java.util.Scanner;

// Superclass
class Loan {

    int loanId;
    String customerName;
    double loanAmount;
    int duration;

    Loan(int loanId, String customerName, double loanAmount, int duration) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.duration = duration;
    }

    void calculateEMI() {
        System.out.println("Loan Details");
    }
}

// Home Loan
class HomeLoan extends Loan {

    HomeLoan(int loanId, String customerName, double loanAmount, int duration) {
        super(loanId, customerName, loanAmount, duration);
    }

    @Override
    void calculateEMI() {

        double rate = 8;
        double interest = (loanAmount * rate * duration) / 100;
        double totalAmount = loanAmount + interest;
        double emi = totalAmount / (duration * 12);

        System.out.println("\n------ Home Loan Report ------");
        System.out.println("Loan ID : " + loanId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Loan Amount : Rs. " + loanAmount);
        System.out.println("Duration : " + duration + " Years");
        System.out.println("Interest Rate : " + rate + "%");
        System.out.println("Total Interest : Rs. " + interest);
        System.out.println("Monthly EMI : Rs. " + emi);
        System.out.println("Total Repayment Amount : Rs. " + totalAmount);
    }
}

// Education Loan
class EducationLoan extends Loan {

    EducationLoan(int loanId, String customerName, double loanAmount, int duration) {
        super(loanId, customerName, loanAmount, duration);
    }

    @Override
    void calculateEMI() {

        double rate = 6;
        double interest = (loanAmount * rate * duration) / 100;
        double totalAmount = loanAmount + interest;
        double emi = totalAmount / (duration * 12);

        System.out.println("\n------ Education Loan Report ------");
        System.out.println("Loan ID : " + loanId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Loan Amount : Rs. " + loanAmount);
        System.out.println("Duration : " + duration + " Years");
        System.out.println("Interest Rate : " + rate + "%");
        System.out.println("Total Interest : Rs. " + interest);
        System.out.println("Monthly EMI : Rs. " + emi);
        System.out.println("Total Repayment Amount : Rs. " + totalAmount);
    }
}

// Vehicle Loan
class VehicleLoan extends Loan {

    VehicleLoan(int loanId, String customerName, double loanAmount, int duration) {
        super(loanId, customerName, loanAmount, duration);
    }

    @Override
    void calculateEMI() {

        double rate = 9;
        double interest = (loanAmount * rate * duration) / 100;
        double totalAmount = loanAmount + interest;
        double emi = totalAmount / (duration * 12);

        System.out.println("\n------ Vehicle Loan Report ------");
        System.out.println("Loan ID : " + loanId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Loan Amount : Rs. " + loanAmount);
        System.out.println("Duration : " + duration + " Years");
        System.out.println("Interest Rate : " + rate + "%");
        System.out.println("Total Interest : Rs. " + interest);
        System.out.println("Monthly EMI : Rs. " + emi);
        System.out.println("Total Repayment Amount : Rs. " + totalAmount);
    }
}

// Main Class
public class q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Loan loan;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Loan Management System =====");
            System.out.println("1. Home Loan");
            System.out.println("2. Education Loan");
            System.out.println("3. Vehicle Loan");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Loan ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Loan Amount : ");
                    double amount = sc.nextDouble();

                    System.out.print("Enter Duration (Years) : ");
                    int years = sc.nextInt();

                    loan = new HomeLoan(id, name, amount, years);

                    loan.calculateEMI();

                    break;

                case 2:

                    System.out.print("Enter Loan ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Loan Amount : ");
                    amount = sc.nextDouble();

                    System.out.print("Enter Duration (Years) : ");
                    years = sc.nextInt();

                    loan = new EducationLoan(id, name, amount, years);

                    loan.calculateEMI();

                    break;

                case 3:

                    System.out.print("Enter Loan ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Loan Amount : ");
                    amount = sc.nextDouble();

                    System.out.print("Enter Duration (Years) : ");
                    years = sc.nextInt();

                    loan = new VehicleLoan(id, name, amount, years);

                    loan.calculateEMI();

                    break;

                case 4:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}