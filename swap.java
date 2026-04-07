//Swap with third variable
import java.util.Scanner; 
public class swap {
    public static void main(String[] args) {
        
     java.util.Scanner s = new Scanner(System.in);
     System.out.println("Enter the first number: ");
     int a = s.nextInt();

      System.out.println("Enter the second number: ");
     int b = s.nextInt();

     System.out.println("Before swapping: a = "+ a + " b = "+ b);
     int temp =a;
     a=b;
     b=temp;

     System.out.println("After swapping: a = "+ a + " b = "+ b);


    }
    
}
