import java.util.Scanner;

// Superclass
class Consumer {

    int consumerId;
    String name;
    int units;

    Consumer(int consumerId, String name, int units) {
        this.consumerId = consumerId;
        this.name = name;
        this.units = units;
    }

    void calculateBill() {
        System.out.println("Bill Calculation");
    }
}

// Domestic Consumer
class DomesticConsumer extends Consumer {

    DomesticConsumer(int consumerId, String name, int units) {
        super(consumerId, name, units);
    }

    @Override
    void calculateBill() {

        double bill;

        if(units <= 100)
            bill = units * 3;
        else if(units <= 300)
            bill = (100 * 3) + ((units - 100) * 5);
        else
            bill = (100 * 3) + (200 * 5) + ((units - 300) * 7);

        System.out.println("\n------Domestic Electricity Bill------");
        System.out.println("Consumer ID : " + consumerId);
        System.out.println("Name : " + name);
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill : Rs. " + bill);
    }
}

// Commercial Consumer
class CommercialConsumer extends Consumer {

    CommercialConsumer(int consumerId, String name, int units) {
        super(consumerId, name, units);
    }

    @Override
    void calculateBill() {

        double bill;

        if(units <= 100)
            bill = units * 6;
        else if(units <= 300)
            bill = (100 * 6) + ((units - 100) * 8);
        else
            bill = (100 * 6) + (200 * 8) + ((units - 300) * 10);

        System.out.println("\n------Commercial Electricity Bill------");
        System.out.println("Consumer ID : " + consumerId);
        System.out.println("Name : " + name);
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill : Rs. " + bill);
    }
}

// Main Class
public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Consumer c;

        int choice;

        do {

            System.out.println("\n===== Electricity Billing System =====");
            System.out.println("1. Domestic Consumer");
            System.out.println("2. Commercial Consumer");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Consumer ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Units Consumed : ");
                    int units = sc.nextInt();

                    c = new DomesticConsumer(id, name, units);

                    c.calculateBill();

                    break;

                case 2:

                    System.out.print("Enter Consumer ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Units Consumed : ");
                    units = sc.nextInt();

                    c = new CommercialConsumer(id, name, units);

                    c.calculateBill();

                    break;

                case 3:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

        sc.close();
    }
}
