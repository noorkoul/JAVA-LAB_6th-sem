import java.util.Scanner;

// Interface
interface InterestCalculator {

    void calculateSimpleInterest();

    void calculateCompoundInterest();
}

// Class implementing the interface
class Interest implements InterestCalculator {

    double principal, rate, time;

    Interest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public void calculateSimpleInterest() {

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    @Override
    public void calculateCompoundInterest() {

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Compound Interest = " + ci);
    }
}

// Main class
public class q2interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        InterestCalculator obj = new Interest(principal, rate, time);

        System.out.println("\n----- Interest Details -----");
        obj.calculateSimpleInterest();
        obj.calculateCompoundInterest();

        sc.close();
    }
}