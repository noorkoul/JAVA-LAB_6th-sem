import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a 5 digit number");

        int num= sc.nextInt();

       int oddsum=0;
       int evensum=0;

       for(int position=1; position<=5;position ++){
        int digit= num%10;

        if(position%2==0){
            evensum=digit+evensum;
        }else{
            oddsum=digit+oddsum;
        }

            num=num/10;
       }

       int difference=oddsum-evensum;

       System.out.println("ODD SUM= " + oddsum);
       System.out.println("EVEN SUM= " + evensum);
       System.out.println("DIFFERENCE= " + difference);

       sc.close();


                      
        
    }
    
}
