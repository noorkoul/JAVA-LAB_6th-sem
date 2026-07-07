import java.util.Scanner;

// Interface
interface EmployeeSalary {

    void calculateGrossSalary();

    void calculateNetSalary();
}

// Class implementing the interface
class Employee implements EmployeeSalary {

    double basicPay, hra, da, allowances;
    double grossSalary, netSalary;

    Employee(double basicPay, double hra, double da, double allowances) {
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
        this.allowances = allowances;
    }

    @Override
    public void calculateGrossSalary() {

        grossSalary = basicPay + hra + da + allowances;

        System.out.println("Gross Salary = Rs. " + grossSalary);
    }

    @Override
    public void calculateNetSalary() {

        double deduction = grossSalary * 0.10; // 10% deduction

        netSalary = grossSalary - deduction;

        System.out.println("Deduction (10%) = Rs. " + deduction);
        System.out.println("Net Salary = Rs. " + netSalary);
    }
}

// Main Class
public class q4interex{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Other Allowances: ");
        double allowances = sc.nextDouble();

        EmployeeSalary emp = new Employee(basicPay, hra, da, allowances);

        System.out.println("\n----- Salary Statement -----");

        emp.calculateGrossSalary();
        emp.calculateNetSalary();

        sc.close();
    }
}