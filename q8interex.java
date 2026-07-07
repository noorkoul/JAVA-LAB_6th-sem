import java.util.InputMismatchException;
import java.util.Scanner;

public class q8interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Total Marks Obtained: ");
            double obtained = sc.nextDouble();

            System.out.print("Enter Maximum Marks: ");
            double total = sc.nextDouble();

            if (total == 0) {
                throw new ArithmeticException("Maximum marks cannot be zero.");
            }

            double percentage = (obtained / total) * 100;

            System.out.println("Percentage = " + percentage + "%");

        } catch (InputMismatchException e) {

            System.out.println("Invalid input! Please enter numeric values.");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}