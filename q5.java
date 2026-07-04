import java.util.Scanner;

// Superclass
class Vehicle {

    String vehicleNo;
    String customerName;
    int days;

    Vehicle(String vehicleNo, String customerName, int days) {
        this.vehicleNo = vehicleNo;
        this.customerName = customerName;
        this.days = days;
    }

    void calculateRent() {
        System.out.println("Rental Calculation");
    }
}

// Car Class
class Car extends Vehicle {

    Car(String vehicleNo, String customerName, int days) {
        super(vehicleNo, customerName, days);
    }

    @Override
    void calculateRent() {

        double rent = days * 1500;
        double fuel = rent * 0.05;
        double gst = (rent + fuel) * 0.18;
        double finalAmount = rent + fuel + gst;

        System.out.println("\n------ Car Rental Report ------");
        System.out.println("Vehicle Number : " + vehicleNo);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Days Rented : " + days);
        System.out.println("Rental Cost : Rs. " + rent);
        System.out.println("Fuel Surcharge : Rs. " + fuel);
        System.out.println("GST (18%) : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + finalAmount);
    }
}

// Bike Class
class Bike extends Vehicle {

    Bike(String vehicleNo, String customerName, int days) {
        super(vehicleNo, customerName, days);
    }

    @Override
    void calculateRent() {

        double rent = days * 500;
        double fuel = rent * 0.05;
        double gst = (rent + fuel) * 0.18;
        double finalAmount = rent + fuel + gst;

        System.out.println("\n------ Bike Rental Report ------");
        System.out.println("Vehicle Number : " + vehicleNo);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Days Rented : " + days);
        System.out.println("Rental Cost : Rs. " + rent);
        System.out.println("Fuel Surcharge : Rs. " + fuel);
        System.out.println("GST (18%) : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + finalAmount);
    }
}

// Bus Class
class Bus extends Vehicle {

    Bus(String vehicleNo, String customerName, int days) {
        super(vehicleNo, customerName, days);
    }

    @Override
    void calculateRent() {

        double rent = days * 4000;
        double fuel = rent * 0.05;
        double gst = (rent + fuel) * 0.18;
        double finalAmount = rent + fuel + gst;

        System.out.println("\n------ Bus Rental Report ------");
        System.out.println("Vehicle Number : " + vehicleNo);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Days Rented : " + days);
        System.out.println("Rental Cost : Rs. " + rent);
        System.out.println("Fuel Surcharge : Rs. " + fuel);
        System.out.println("GST (18%) : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + finalAmount);
    }
}

// Main Class
public class q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle v;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Bus");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Vehicle Number : ");
                    String vNo = sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    int days = sc.nextInt();

                    v = new Car(vNo, name, days);

                    v.calculateRent();

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Vehicle Number : ");
                    vNo = sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    days = sc.nextInt();

                    v = new Bike(vNo, name, days);

                    v.calculateRent();

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Vehicle Number : ");
                    vNo = sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    days = sc.nextInt();

                    v = new Bus(vNo, name, days);

                    v.calculateRent();

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