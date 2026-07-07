import java.util.Scanner;

public class q4exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);

            System.out.println("Integer value = " + number);
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }

        finally {
            System.out.println("Program terminated successfully.");
            sc.close();
        }
    }
}