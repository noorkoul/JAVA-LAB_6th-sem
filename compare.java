//compare two numbers
import java.util.Scanner; 
public class compare {
    public static void main(String [] args){
   
     java.util.Scanner s = new Scanner(System.in);

     System.out.println("Enter the first number: ");
     int a = s.nextInt();

      System.out.println("Enter the second number: ");
     int b = s.nextInt();

     if(a>b){
        System.out.println("first number is greater than the second");
     }else if(a<b){
        System.out.println("first number is lesser than the second");
     }else{
        System.out.println("Both numbers are equal");


     }

    
}
}
