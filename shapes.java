//Area and perimeter of circle and rectangle
import java.util.Scanner; 
public class shapes {
    public static void main(String [] args){
        //for circle 
    System.out.println("Enter the radius of circle: ");
     java.util.Scanner s = new Scanner(System.in);

     double radius= s.nextDouble();

     double circleArea= Math.PI * radius * radius;
     double circlePerimeter= 2 * Math.PI * radius;

    System.out.println("Area of circle: " + circleArea);
    System.out.println("Perimeter of circle: " + circlePerimeter);

        //for rectangle

    System.out.println("Enter the length of rectangle: ");
    double length= s.nextDouble();

    System.out.println("Enter the width of rectangle: ");
    
    double width= s.nextDouble();

    double rectArea=  length * width;
    double rectPerimeter= 2 * (length +width);

    
    System.out.println("Area of rectangle: " + rectArea);
    System.out.println("Perimeter of rectangle: " + rectPerimeter);












    
    }
    
}
