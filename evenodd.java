//Check if the number is even=1 or odd=0
import java.util.Scanner; 
public class evenodd {
    public static void main(String[] args) {
     java.util.Scanner s = new Scanner(System.in);

     System.out.println("Enter a number: ");
     int number= s.nextInt();

     if(number%2==0){
        System.out.println(1);
        System.out.println("even");

     }else{
        System.out.println(0);
        System.out.println("odd");




     }

        
    }
    
}
