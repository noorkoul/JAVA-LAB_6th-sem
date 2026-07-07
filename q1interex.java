import java.util.Scanner;

// Interface
interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

// Circle Class
class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}

// Rectangle Class
class Rectangle implements Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

// Main Class
public class q1interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape shape;      // Runtime Polymorphism

        int choice;

        do {

            System.out.println("\n===== Shape Calculator =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Radius: ");
                    double radius = sc.nextDouble();

                    shape = new Circle(radius);

                    shape.calculateArea();
                    shape.calculatePerimeter();

                    break;

                case 2:

                    System.out.print("Enter Length: ");
                    double length = sc.nextDouble();

                    System.out.print("Enter Breadth: ");
                    double breadth = sc.nextDouble();

                    shape = new Rectangle(length, breadth);

                    shape.calculateArea();
                    shape.calculatePerimeter();

                    break;

                case 3:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}