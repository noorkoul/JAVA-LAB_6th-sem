import java.util.Scanner;

// Superclass
class InsurancePolicy {

    int policyNo;
    String policyHolder;
    int age;
    double amount;

    InsurancePolicy(int policyNo, String policyHolder, int age, double amount) {
        this.policyNo = policyNo;
        this.policyHolder = policyHolder;
        this.age = age;
        this.amount = amount;
    }

    void calculatePremium() {
        System.out.println("Insurance Premium");
    }
}

// Vehicle Insurance
class VehicleInsurance extends InsurancePolicy {

    VehicleInsurance(int policyNo, String policyHolder, int age, double amount) {
        super(policyNo, policyHolder, age, amount);
    }

    @Override
    void calculatePremium() {

        double premium = amount * 0.03;

        if (age > 50) {
            premium = premium + (premium * 0.20);
        }

        System.out.println("\n------ Vehicle Insurance Policy ------");
        System.out.println("Policy Number : " + policyNo);
        System.out.println("Policy Holder : " + policyHolder);
        System.out.println("Age : " + age);
        System.out.println("Vehicle Value : Rs. " + amount);
        System.out.println("Premium : Rs. " + premium);
    }
}

// Health Insurance
class HealthInsurance extends InsurancePolicy {

    HealthInsurance(int policyNo, String policyHolder, int age, double amount) {
        super(policyNo, policyHolder, age, amount);
    }

    @Override
    void calculatePremium() {

        double premium = amount * 0.05;

        if (age > 50) {
            premium = premium + (premium * 0.20);
        }

        System.out.println("\n------ Health Insurance Policy ------");
        System.out.println("Policy Number : " + policyNo);
        System.out.println("Policy Holder : " + policyHolder);
        System.out.println("Age : " + age);
        System.out.println("Insured Amount : Rs. " + amount);
        System.out.println("Premium : Rs. " + premium);
    }
}

// Main Class
public class q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InsurancePolicy policy;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Insurance Management System =====");
            System.out.println("1. Vehicle Insurance");
            System.out.println("2. Health Insurance");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Policy Number : ");
                    int policyNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Policy Holder Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    System.out.print("Enter Vehicle Value : ");
                    double value = sc.nextDouble();

                    policy = new VehicleInsurance(policyNo, name, age, value);

                    policy.calculatePremium();

                    break;

                case 2:

                    System.out.print("Enter Policy Number : ");
                    policyNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Policy Holder Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    age = sc.nextInt();

                    System.out.print("Enter Insured Amount : ");
                    value = sc.nextDouble();

                    policy = new HealthInsurance(policyNo, name, age, value);

                    policy.calculatePremium();

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