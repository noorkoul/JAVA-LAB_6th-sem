import java.util.Scanner;

class Rectangle {

    double length, breadth;

    // Calculate area
    double area() {
        return length * breadth;
    }

    // Calculate perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }

    // Calculate diagonal
    double diagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }

    // Check square
    boolean isSquare() {
        return length == breadth;
    }
}

public class q3classo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // Input first rectangle
        System.out.print("Enter length of first rectangle: ");
        r1.length = sc.nextDouble();

        System.out.print("Enter breadth of first rectangle: ");
        r1.breadth = sc.nextDouble();

        // Input second rectangle
        System.out.print("Enter length of second rectangle: ");
        r2.length = sc.nextDouble();

        System.out.print("Enter breadth of second rectangle: ");
        r2.breadth = sc.nextDouble();

        // Display first rectangle
        System.out.println("\nFirst Rectangle");
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        if (r1.isSquare())
            System.out.println("It is a Square.");
        else
            System.out.println("It is not a Square.");

        // Display second rectangle
        System.out.println("\nSecond Rectangle");
        System.out.println("Area = " + r2.area());
        System.out.println("Perimeter = " + r2.perimeter());

        if (r2.isSquare())
            System.out.println("It is a Square.");
        else
            System.out.println("It is not a Square.");

        // Compare area
        if (r1.area() > r2.area())
            System.out.println("\nFirst rectangle has larger area.");
        else if (r2.area() > r1.area())
            System.out.println("\nSecond rectangle has larger area.");
        else
            System.out.println("\nBoth rectangles have equal area.");

        // Compare diagonal
        if (r1.diagonal() > r2.diagonal())
            System.out.println("First rectangle has larger diagonal.");
        else if (r2.diagonal() > r1.diagonal())
            System.out.println("Second rectangle has larger diagonal.");
        else
            System.out.println("Both rectangles have equal diagonal.");

        sc.close();
    }
}