import java.util.Scanner;

// Superclass
class Patient {

    int patientId;
    String patientName;
    double medicineCharge;

    Patient(int patientId, String patientName, double medicineCharge) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.medicineCharge = medicineCharge;
    }

    void calculateBill() {
        System.out.println("Hospital Bill");
    }
}

// OutPatient Class
class OutPatient extends Patient {

    OutPatient(int patientId, String patientName, double medicineCharge) {
        super(patientId, patientName, medicineCharge);
    }

    @Override
    void calculateBill() {

        double consultationFee = 500;
        double totalBill = consultationFee + medicineCharge;

        System.out.println("\n------ OutPatient Bill ------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Consultation Fee : Rs. " + consultationFee);
        System.out.println("Medicine Charges : Rs. " + medicineCharge);
        System.out.println("Total Hospital Bill : Rs. " + totalBill);
    }
}

// InPatient Class
class InPatient extends Patient {

    int days;

    InPatient(int patientId, String patientName, double medicineCharge, int days) {
        super(patientId, patientName, medicineCharge);
        this.days = days;
    }

    @Override
    void calculateBill() {

        double consultationFee = 500;
        double roomCharge = days * 2500;
        double nursingCharge = days * 1000;

        double totalBill = consultationFee + roomCharge + nursingCharge + medicineCharge;

        System.out.println("\n------ InPatient Bill ------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Days Admitted : " + days);
        System.out.println("Consultation Fee : Rs. " + consultationFee);
        System.out.println("Room Charges : Rs. " + roomCharge);
        System.out.println("Nursing Charges : Rs. " + nursingCharge);
        System.out.println("Medicine Charges : Rs. " + medicineCharge);
        System.out.println("Total Hospital Bill : Rs. " + totalBill);
    }
}

// Main Class
public class q6  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Hospital Billing System =====");
            System.out.println("1. OutPatient");
            System.out.println("2. InPatient");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Patient Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Medicine Charges : ");
                    double medicine = sc.nextDouble();

                    p = new OutPatient(id, name, medicine);

                    p.calculateBill();

                    break;

                case 2:

                    System.out.print("Enter Patient ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Patient Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Number of Days : ");
                    int days = sc.nextInt();

                    System.out.print("Enter Medicine Charges : ");
                    medicine = sc.nextDouble();

                    p = new InPatient(id, name, medicine, days);

                    p.calculateBill();

                    break;

                case 3:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}