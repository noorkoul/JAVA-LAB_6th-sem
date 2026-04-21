import java.util.Scanner;
public class specialNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number: ");

        int num=sc.nextInt();

        int first=num/10;
        int last= num%10;

        int sum= first+last;
        int product= first*last;

        if(sum+product==num){
            System.out.println("SPECIAL NUMBER");
        }else{
            System.out.println("NOT A SPECIAL NUMBER!!");
        }
    }
    
}
