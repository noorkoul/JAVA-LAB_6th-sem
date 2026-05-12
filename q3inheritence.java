class Shape {

    double getArea() {
        return 0;

    }
}

class Rectangle extends Shape {
    double length;
    double width;

    double getArea() {
        return length * width;
    }
}

public class q3inheritence {
    public static void main(String[] args) {

        Shape s = new Shape();
        System.out.println("Shape area: " + s.getArea());

        Rectangle rect = new Rectangle();
        rect.length = 30;
        rect.width = 60;
        System.out.println("Rectangle area:  " + rect.getArea());
    }

}
