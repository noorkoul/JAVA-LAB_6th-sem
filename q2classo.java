import java.util.Scanner;

class Circle {

    double radius;

    // Calculate area
    double area() {
        return 3.14 * radius * radius;
    }

    // Calculate circumference
    double circumference() {
        return 2 * 3.14 * radius;
    }
}

public class q2classo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        // Input radius
        System.out.print("Enter radius of first circle: ");
        c1.radius = sc.nextDouble();

        System.out.print("Enter radius of second circle: ");
        c2.radius = sc.nextDouble();

        // Display area and circumference
        System.out.println("\nFirst Circle");
        System.out.println("Area = " + c1.area());
        System.out.println("Circumference = " + c1.circumference());

        System.out.println("\nSecond Circle");
        System.out.println("Area = " + c2.area());
        System.out.println("Circumference = " + c2.circumference());

        // Compare areas
        if (c1.area() > c2.area()) {
            System.out.println("\nFirst circle has larger area.");
        } else if (c2.area() > c1.area()) {
            System.out.println("\nSecond circle has larger area.");
        } else {
            System.out.println("\nBoth circles have equal area.");
        }

        // Check fitting
        if (c1.radius < c2.radius) {
            System.out.println("First circle can fit inside second circle.");
        } else if (c2.radius < c1.radius) {
            System.out.println("Second circle can fit inside first circle.");
        } else {
            System.out.println("Both circles are of the same size.");
        }

        sc.close();
    }
} 
