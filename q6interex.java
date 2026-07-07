import java.util.Scanner;

// Interface
interface Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return (double) a / b;
    }

    static int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Modulus by zero is not possible.");
            return 0;
        }
        return a % b;
    }
}

// Main Class
public class q6interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter First Number: ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number: ");
                int b = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Result = " + Calculator.add(a, b));
                        break;

                    case 2:
                        System.out.println("Result = " + Calculator.subtract(a, b));
                        break;

                    case 3:
                        System.out.println("Result = " + Calculator.multiply(a, b));
                        break;

                    case 4:
                        System.out.println("Result = " + Calculator.divide(a, b));
                        break;

                    case 5:
                        System.out.println("Result = " + Calculator.modulus(a, b));
                        break;
                }
            }

        } while (choice != 6);

        System.out.println("Thank You!");
        sc.close();
    }
}
