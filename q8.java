import java.util.Scanner;

// Superclass
class Room {

    int roomNo;
    String customerName;
    int days;
    double foodCharges;

    Room(int roomNo, String customerName, int days, double foodCharges) {
        this.roomNo = roomNo;
        this.customerName = customerName;
        this.days = days;
        this.foodCharges = foodCharges;
    }

    void calculateBill() {
        System.out.println("Hotel Bill");
    }
}

// Standard Room
class StandardRoom extends Room {

    StandardRoom(int roomNo, String customerName, int days, double foodCharges) {
        super(roomNo, customerName, days, foodCharges);
    }

    @Override
    void calculateBill() {

        double roomCharges = days * 2000;
        double total = roomCharges + foodCharges;
        double gst = total * 0.12;
        double finalBill = total + gst;

        System.out.println("\n------ Standard Room Bill ------");
        System.out.println("Room Number : " + roomNo);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Days Stayed : " + days);
        System.out.println("Room Charges : Rs. " + roomCharges);
        System.out.println("Food Charges : Rs. " + foodCharges);
        System.out.println("GST (12%) : Rs. " + gst);
        System.out.println("Final Bill : Rs. " + finalBill);
    }
}

// Deluxe Room
class DeluxeRoom extends Room {

    DeluxeRoom(int roomNo, String customerName, int days, double foodCharges) {
        super(roomNo, customerName, days, foodCharges);
    }

    @Override
    void calculateBill() {

        double roomCharges = days * 4000;
        double total = roomCharges + foodCharges;
        double gst = total * 0.12;
        double finalBill = total + gst;

        System.out.println("\n------ Deluxe Room Bill ------");
        System.out.println("Room Number : " + roomNo);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Days Stayed : " + days);
        System.out.println("Room Charges : Rs. " + roomCharges);
        System.out.println("Food Charges : Rs. " + foodCharges);
        System.out.println("GST (12%) : Rs. " + gst);
        System.out.println("Final Bill : Rs. " + finalBill);
    }
}

// Suite Room
class SuiteRoom extends Room {

    SuiteRoom(int roomNo, String customerName, int days, double foodCharges) {
        super(roomNo, customerName, days, foodCharges);
    }

    @Override
    void calculateBill() {

        double roomCharges = days * 7000;
        double total = roomCharges + foodCharges;
        double gst = total * 0.12;
        double finalBill = total + gst;

        System.out.println("\n------ Suite Room Bill ------");
        System.out.println("Room Number : " + roomNo);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Days Stayed : " + days);
        System.out.println("Room Charges : Rs. " + roomCharges);
        System.out.println("Food Charges : Rs. " + foodCharges);
        System.out.println("GST (12%) : Rs. " + gst);
        System.out.println("Final Bill : Rs. " + finalBill);
    }
}

// Main Class
public class q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room r;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Hotel Management System =====");
            System.out.println("1. Standard Room");
            System.out.println("2. Deluxe Room");
            System.out.println("3. Suite Room");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Room Number : ");
                    int roomNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    int days = sc.nextInt();

                    System.out.print("Enter Food Charges : ");
                    double food = sc.nextDouble();

                    r = new StandardRoom(roomNo, name, days, food);

                    r.calculateBill();

                    break;

                case 2:

                    System.out.print("Enter Room Number : ");
                    roomNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    days = sc.nextInt();

                    System.out.print("Enter Food Charges : ");
                    food = sc.nextDouble();

                    r = new DeluxeRoom(roomNo, name, days, food);

                    r.calculateBill();

                    break;

                case 3:

                    System.out.print("Enter Room Number : ");
                    roomNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    days = sc.nextInt();

                    System.out.print("Enter Food Charges : ");
                    food = sc.nextDouble();

                    r = new SuiteRoom(roomNo, name, days, food);

                    r.calculateBill();

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