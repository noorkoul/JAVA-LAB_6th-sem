import java.util.Scanner;

class Interest {

    double principal, rate, time;

    // Simple Interest
    double simpleInterest() {
        return (principal * rate * time) / 100;
    }

    // Compound Interest
    double compoundInterest() {

        double amount = principal * Math.pow(1 + rate / 100, time);

        return amount - principal;
    }
}

public class q8classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Interest obj = new Interest();

        System.out.print("Enter Principal: ");
        obj.principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        obj.rate = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        obj.time = sc.nextDouble();

        double SI = obj.simpleInterest();
        double CI = obj.compoundInterest();

        System.out.println("\nSimple Interest = " + SI);
        System.out.println("Compound Interest = " + CI);

        if (SI > CI)
            System.out.println("Simple Interest is greater.");
        else if (CI > SI)
            System.out.println("Compound Interest is greater.");
        else
            System.out.println("Both are equal.");

        System.out.println("Difference = " + Math.abs(CI - SI));

        sc.close();
    }
}