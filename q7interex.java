import java.util.Scanner;

// Interface
interface ShoppingCart {

    void calculateSubtotal();

    void calculateGST();

    void calculateDiscount();

    void calculateFinalBill();
}

// Class implementing interface
class Bill implements ShoppingCart {

    double subtotal = 0;
    double gst, discount, finalBill;

    Bill(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public void calculateSubtotal() {

        System.out.println("Subtotal = Rs. " + subtotal);
    }

    @Override
    public void calculateGST() {

        gst = subtotal * 0.18;

        System.out.println("GST (18%) = Rs. " + gst);
    }

    @Override
    public void calculateDiscount() {

        if (subtotal >= 5000)
            discount = subtotal * 0.10;
        else
            discount = 0;

        System.out.println("Discount = Rs. " + discount);
    }

    @Override
    public void calculateFinalBill() {

        finalBill = subtotal + gst - discount;

        System.out.println("Final Payable Bill = Rs. " + finalBill);
    }
}

// Main Class
public class q7interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Items: ");
        int n = sc.nextInt();

        double subtotal = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nItem " + i);

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            subtotal += price * qty;
        }

        ShoppingCart bill = new Bill(subtotal);

        System.out.println("\n----- Shopping Bill -----");

        bill.calculateSubtotal();
        bill.calculateGST();
        bill.calculateDiscount();
        bill.calculateFinalBill();

        sc.close();
    }
}