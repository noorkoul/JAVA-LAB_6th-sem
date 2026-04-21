import java.util.Scanner;
public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int n= sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum-i; //even number-> subtract
            }else{
                sum=sum+i; //odd number
            }

        }
        System.out.println("Final sum= " + sum );

        sc.close();
    }
    
}
