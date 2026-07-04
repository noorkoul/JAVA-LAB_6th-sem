import java.util.Scanner;

class Calculator {

    double num1, num2;
    char op;

    String[] history = new String[5];
    int count = 0;

    void calculate(double n1, double n2, char operator) {

        num1 = n1;
        num2 = n2;
        op = operator;

        double result = 0;
        boolean valid = true;

        switch (op) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 % num2;
                }
                break;

            default:
                System.out.println("Invalid Operator");
                valid = false;
        }

        if (valid) {
            System.out.println("Result = " + result);

            String record = num1 + " " + op + " " + num2 + " = " + result;

            if (count < 5) {
                history[count] = record;
                count++;
            } else {
                for (int i = 0; i < 4; i++) {
                    history[i] = history[i + 1];
                }
                history[4] = record;
            }
        }
    }

    void displayHistory() {

        System.out.println("\nLast Five Calculations:");

        for (int i = 0; i < count; i++) {
            System.out.println(history[i]);
        }
    }
}

public class q1classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        char choice;

        do {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+,-,*,/,%): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            obj.calculate(a, b, op);

            System.out.print("\nDo another calculation? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice=='y' || choice=='Y');

        obj.displayHistory();

        sc.close();
    }
}