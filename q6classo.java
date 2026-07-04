import java.util.Scanner;

class Employee {

    double basicSalary;
    int overtimeHours;
    int leaveDeductions;

    double hra, da, tax, bonus, grossSalary, netSalary;

    void calculateSalary() {

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        bonus = overtimeHours * 100;

        // Tax according to salary slab
        if (basicSalary < 30000)
            tax = 0;
        else if (basicSalary <= 50000)
            tax = basicSalary * 0.10;
        else
            tax = basicSalary * 0.20;

        grossSalary = basicSalary + hra + da + bonus;

        netSalary = grossSalary - tax - (leaveDeductions * 500);
    }

    void display() {

        System.out.println("\nBasic Salary = " + basicSalary);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Bonus = " + bonus);
        System.out.println("Tax = " + tax);
        System.out.println("Gross Salary = " + grossSalary);
        System.out.println("Net Salary = " + netSalary);
    }
}

public class q6classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        System.out.print("Enter Overtime Hours: ");
        emp.overtimeHours = sc.nextInt();

        System.out.print("Enter Leave Deductions (No. of leaves): ");
        emp.leaveDeductions = sc.nextInt();

        emp.calculateSalary();

        emp.display();

        sc.close();
    }
}