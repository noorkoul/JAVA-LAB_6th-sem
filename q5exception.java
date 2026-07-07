import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class q5exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("You are eligible.");
        }

        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Program terminated successfully.");
            sc.close();
        }
    }
}