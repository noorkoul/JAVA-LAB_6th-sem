import java.util.Scanner;
import java.util.InputMismatchException;

public class q1exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers.");
        }

        finally {
            System.out.println("Program terminated successfully.");
            sc.close();
        }
    }
}