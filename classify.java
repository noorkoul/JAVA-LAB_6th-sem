import java.util.Scanner;

public class classify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num= sc.nextInt();

        //positive or negative or zero

        if(num>0){
            System.out.println("Positive number");
        }else if(num<0){
            System.out.println("Negative number");
        }else{
            System.out.println("ZERO!!!");
        }

        //Even or odd

        if(num%2==0){
            System.out.println("EVEN NUMBER!!");
        }else{
            System.out.println("ODD NUMBER!!!");
        }
        //Multiple of 5

        if(num%5==0){
            System.out.println("Multiple of 5");
        }else{
            System.out.println("Not multiple of 5");
        }

        //Three digit number

        if(num>=100 && num<=999 || num<=-100 && num>=-999){
            System.out.println("THREE DIGIT NUMBER!!");
        }else{
            System.out.println("NOT A THREE DIGIT NUMBER!!");
        }
    }

    
}
