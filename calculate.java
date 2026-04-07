//Print 
import java.util.Scanner; 
public class calculate {
    public static void main(String [] args)
    {   int x, y;
         System.out.println("Enter two numbers: ");
         java.util.Scanner s = new Scanner(System.in);
         
         x=s.nextInt();
         y=s.nextInt();

         int sum=x+y;
         int difference=x-y;
         int product=x*y;
         int quotient=x/y;
         int remainder=x%y;
            
         System.out.println("Sum is " + sum);
         System.out.println("Difference  is " + difference);
         System.out.println("Product is " + product);
         
         if(y!=0) {
            System.out.println("Quotient is " + quotient);
            System.out.println("Remainder is " + remainder);
         }else{
            System.out.println("Cannot divide by zero!");

         }



           


         }

        


    }

    

