import java.util.Scanner;

public class seriespattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.err.println("Series: ");
        int term = 2;
        System.out.println(term + ""); // printing the first term
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                term = term * 3; // multiply by 3 at even
            } else {
                term = term + 1; // add 1 at odd
            }
            System.out.println(term + "");
        }

    }

}
