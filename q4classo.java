import java.util.Scanner;

class Triangle {

    double a, b, c;

    // Check if valid triangle
    boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Identify type
    void type() {
        if (a == b && b == c)
            System.out.println("Triangle is Equilateral.");
        else if (a == b || b == c || a == c)
            System.out.println("Triangle is Isosceles.");
        else
            System.out.println("Triangle is Scalene.");
    }

    // Calculate area
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class q4classo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();

        System.out.print("Enter first side: ");
        t.a = sc.nextDouble();

        System.out.print("Enter second side: ");
        t.b = sc.nextDouble();

        System.out.print("Enter third side: ");
        t.c = sc.nextDouble();

        if (t.isValid()) {

            System.out.println("Valid Triangle");

            t.type();

            System.out.println("Area = " + t.area());

        } else {

            System.out.println("Not a Valid Triangle");
        }

        sc.close();
    }
}
