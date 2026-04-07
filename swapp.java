import java.util.Scanner; 
public class swapp {
        public static void main(String[] args) {
        
     java.util.Scanner s = new Scanner(System.in);
     System.out.println("Enter the first number: ");
     int a = s.nextInt();

      System.out.println("Enter the second number: ");
     int b = s.nextInt();

     System.out.println("Before swapping: a = "+ a + " b = "+ b);
     //Swapping
     a=a+b;
     b=a-b;
     a=a-b;

     System.out.println("After swapping: a = "+ a + " b = "+ b);


    }
    
    
}
