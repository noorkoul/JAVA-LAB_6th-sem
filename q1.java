import java.util.Scanner;

// Superclass
class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        System.out.println("Salary Calculation");
    }
}

// Permanent Employee
class PermanentEmployee extends Employee {

    PermanentEmployee(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    void calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.15;
        double pf = basicSalary * 0.12;

        double gross = basicSalary + hra + da;
        double net = gross - pf;

        System.out.println("\n------Permanent Employee Report------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + gross);
        System.out.println("PF Deduction : " + pf);
        System.out.println("Net Salary : " + net);
    }
}

// Contract Employee
class ContractEmployee extends Employee {

    ContractEmployee(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    void calculateSalary() {

        double allowance = basicSalary * 0.10;
        double gross = basicSalary + allowance;
        double net = gross;

        System.out.println("\n------Contract Employee Report------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Service Allowance : " + allowance);
        System.out.println("Gross Salary : " + gross);
        System.out.println("PF Deduction : 0");
        System.out.println("Net Salary : " + net);
    }
}

// Main Class
public class q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp;

        int choice;

        do {

            System.out.println("\n===== Payroll Management System =====");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Contract Employee");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Employee ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary : ");
                    double salary = sc.nextDouble();

                    emp = new PermanentEmployee(id, name, salary);

                    emp.calculateSalary();

                    break;

                case 2:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Basic Salary : ");
                    salary = sc.nextDouble();

                    emp = new ContractEmployee(id, name, salary);

                    emp.calculateSalary();

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