import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the x coordinate: ");
        int x = sc.nextInt();

        System.out.println("Enter the y coordinate: ");
        int y = sc.nextInt();

        // positions
        if (x == 0 && y == 0) {
            System.out.println("Point is on the origin.");
        } else if (x == 0) {
            System.out.println("Point lies on the y-axis");
        } else if (y == 0) {
            System.out.println("Point lies on the x-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Point is in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in the 2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in the 3rd Quadrant");
        } else {
            System.out.println("Point lies in the 4th Quandrant");
        }
    }
}
