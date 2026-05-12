class Shapee {
    double getArea() {
        return 0;
    }
}

class Rect extends Shapee {
    double length;
    double width;

    @Override
    double getArea() {
        return length * width;
    }
}

class Box extends Rect {
    double height;

    @Override
    double getArea() {
        double surfaceArea = 2 * (length * width + length * height + width * height);
        return surfaceArea;
    }
}

public class q7inheritence {
    public static void main(String[] args) {
        Shapee s = new Shapee();
        System.out.println("Shape area: " + s.getArea());

        Rect r = new Rect();
        r.length = 20;
        r.width = 40;
        System.out.println("Rectangle area: " + r.getArea());

        Box b = new Box();
        b.length = 10;
        b.width = 5;
        b.height = 4;
        System.out.println(" Surface area of box : " + b.getArea());

    }

}
