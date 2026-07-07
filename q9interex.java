import java.util.InputMismatchException;
import java.util.Scanner;

public class q9interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Loan Amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter Annual Interest Rate (%): ");
            double rate = sc.nextDouble();

            System.out.print("Enter Loan Tenure (Years): ");
            int years = sc.nextInt();

            if (principal <= 0 || rate < 0 || years <= 0) {
                throw new ArithmeticException("Invalid input values.");
            }

            double monthlyRate = rate / (12 * 100);
            int months = years * 12;

            double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                    / (Math.pow(1 + monthlyRate, months) - 1);

            System.out.println("Monthly EMI = Rs. " + emi);

        } catch (InputMismatchException e) {

            System.out.println("Invalid input! Enter numeric values only.");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}