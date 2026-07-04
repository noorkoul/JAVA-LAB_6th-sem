import java.util.Scanner;

class Product {

    int productID;
    int quantity;
    double pricePerUnit;
    String expiryStatus;
    char discountCategory;

    double totalCost, discount, tax, finalAmount;

    void calculateInvoice() {

        // Total Cost
        totalCost = quantity * pricePerUnit;

        // Discount
        switch (discountCategory) {

            case 'A':
            case 'a':
                discount = totalCost * 0.20;
                break;

            case 'B':
            case 'b':
                discount = totalCost * 0.10;
                break;

            case 'C':
            case 'c':
                discount = totalCost * 0.05;
                break;

            default:
                discount = 0;
        }

        // Tax
        tax = (totalCost - discount) * 0.05;

        // Final Amount
        finalAmount = totalCost - discount + tax;
    }

    void displayInvoice() {

        System.out.println("\n----- INVOICE -----");

        System.out.println("Product ID = " + productID);
        System.out.println("Total Cost = " + totalCost);
        System.out.println("Discount = " + discount);
        System.out.println("Tax = " + tax);
        System.out.println("Final Amount = " + finalAmount);

        if (expiryStatus.equalsIgnoreCase("Expired"))
            System.out.println("Warning: Product has expired.");
        else
            System.out.println("Product is not expired.");
    }
}

public class q10classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Enter Product ID: ");
        p.productID = sc.nextInt();

        System.out.print("Enter Quantity: ");
        p.quantity = sc.nextInt();

        System.out.print("Enter Price per Unit: ");
        p.pricePerUnit = sc.nextDouble();

        System.out.print("Enter Expiry Status (Expired/NotExpired): ");
        p.expiryStatus = sc.next();

        System.out.print("Enter Discount Category (A/B/C): ");
        p.discountCategory = sc.next().charAt(0);

        p.calculateInvoice();

        p.displayInvoice();

        sc.close();
    }
}
