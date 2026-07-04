import java.util.Scanner;

// Parent Class
class Shape {

    void calculateArea() {
        System.out.println("Area of Shape");
    }
}

// Child Class - Rectangle
class Rectangle extends Shape {

    double length, breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Child Class - Triangle
class Triangle extends Shape {

    double base, height;

    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

public class q9inheritence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter Length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        r.breadth = sc.nextDouble();

        r.calculateArea();

        Triangle t = new Triangle();

        System.out.print("\nEnter Base: ");
        t.base = sc.nextDouble();

        System.out.print("Enter Height: ");
        t.height = sc.nextDouble();

        t.calculateArea();

        sc.close();
    }
}
