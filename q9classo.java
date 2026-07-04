import java.util.Scanner;

class ElectricityBill {

    String consumerType;
    int units;

    double bill, tax, subsidy, lateCharge, finalAmount;

    void calculateBill() {

        // Slab Calculation
        if (units <= 100)
            bill = units * 2;

        else if (units <= 200)
            bill = (100 * 2) + ((units - 100) * 3);

        else
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);

        // Tax
        tax = bill * 0.05;

        // Subsidy
        if (consumerType.equalsIgnoreCase("Domestic"))
            subsidy = 100;
        else
            subsidy = 0;

        // Late Payment Charge
        lateCharge = 50;

        // Final Amount
        finalAmount = bill + tax + lateCharge - subsidy;
    }

    void display() {

        System.out.println("\nBill Amount = " + bill);
        System.out.println("Tax = " + tax);
        System.out.println("Subsidy = " + subsidy);
        System.out.println("Late Payment Charge = " + lateCharge);
        System.out.println("Final Payable Amount = " + finalAmount);
    }
}

public class q9classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElectricityBill eb = new ElectricityBill();

        System.out.print("Enter Consumer Type (Domestic/Commercial): ");
        eb.consumerType = sc.next();

        System.out.print("Enter Units Consumed: ");
        eb.units = sc.nextInt();

        eb.calculateBill();

        eb.display();

        sc.close();
    }
}