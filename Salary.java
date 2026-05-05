import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Basic salary: ");
        double basic = sc.nextInt();

        double hra, da, gross, net, tax = 0;

        // hra(House Rent Allowance)
        if (basic <= 20000) {
            hra = 0.20 * basic; // 20%
        } else {
            hra = 0.30 * basic; // 30%
        }

        // da(Dearness Allowance)

        da = 0.80 * basic;

        // gross

        gross = hra + da + basic;

        // Tax calculate

        if (gross > 50000) {
            tax = 0.10 * gross;
        }

        // net salary
        net = gross - tax;

        // print
        System.out.println("Gross is: " + gross);
        System.out.println("Net salary is: " + net);

    }
}
