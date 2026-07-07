import java.util.Scanner;

public class q3exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.length() < 8) {
                throw new Exception("Password must contain at least 8 characters.");
            }

            System.out.println("Password accepted.");
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Program terminated successfully.");
            sc.close();
        }
    }
}