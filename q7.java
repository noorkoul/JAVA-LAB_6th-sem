import java.util.Scanner;

// Superclass
class Product {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void calculateDiscount() {
        System.out.println("Product Bill");
    }
}

// Electronics Class
class Electronics extends Product {

    Electronics(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    void calculateDiscount() {

        double discount = price * 0.10;
        double amountAfterDiscount = price - discount;
        double gst = amountAfterDiscount * 0.18;
        double finalAmount = amountAfterDiscount + gst;

        System.out.println("\n------ Electronics Bill ------");
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : Rs. " + price);
        System.out.println("Discount (10%) : Rs. " + discount);
        System.out.println("GST (18%) : Rs. " + gst);
        System.out.println("Final Payable Amount : Rs. " + finalAmount);
    }
}

// Clothing Class
class Clothing extends Product {

    Clothing(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    void calculateDiscount() {

        double discount = price * 0.20;
        double amountAfterDiscount = price - discount;
        double gst = amountAfterDiscount * 0.12;
        double finalAmount = amountAfterDiscount + gst;

        System.out.println("\n------ Clothing Bill ------");
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : Rs. " + price);
        System.out.println("Discount (20%) : Rs. " + discount);
        System.out.println("GST (12%) : Rs. " + gst);
        System.out.println("Final Payable Amount : Rs. " + finalAmount);
    }
}

// Books Class
class Books extends Product {

    Books(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    void calculateDiscount() {

        double discount = price * 0.05;
        double amountAfterDiscount = price - discount;
        double gst = amountAfterDiscount * 0.05;
        double finalAmount = amountAfterDiscount + gst;

        System.out.println("\n------ Books Bill ------");
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : Rs. " + price);
        System.out.println("Discount (5%) : Rs. " + discount);
        System.out.println("GST (5%) : Rs. " + gst);
        System.out.println("Final Payable Amount : Rs. " + finalAmount);
    }
}

// Main Class
public class q7  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Online Shopping System =====");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Books");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    p = new Electronics(id, name, price);

                    p.calculateDiscount();

                    break;

                case 2:

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Price : ");
                    price = sc.nextDouble();

                    p = new Clothing(id, name, price);

                    p.calculateDiscount();

                    break;

                case 3:

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Price : ");
                    price = sc.nextDouble();

                    p = new Books(id, name, price);

                    p.calculateDiscount();

                    break;

                case 4:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}