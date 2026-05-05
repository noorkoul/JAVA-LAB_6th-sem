import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int result = 0; // store modified digits

        while (num > 0) {
            int digit = num % 10; // last digit extract

            // replace the digits
            if (digit == 0) {
                digit = 1;
            } else if (digit == 1) {
                digit = 0;
            }

            result = result * 10 + digit; // new number
            num = num / 10;
        }

        int finalresult = 0;
        while (result > 0) {
            int digit = result % 10;
            finalresult = finalresult * 10 + digit;
            result = result / 10;
        }

        System.out.println("OUTPUT: " + finalresult);
    }

}
