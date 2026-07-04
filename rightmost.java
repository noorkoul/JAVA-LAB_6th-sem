//same right most digit
import java.util.Scanner;

public class rightmost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three non- negative integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // last digit
        int d1 = a % 10;
        int d2 = b % 10;
        int d3 = c % 10;

        boolean result = (d1 == d2) || (d2 == d3) || (d1 == d3);

        System.out.println("Result: " + result);
    }
}
