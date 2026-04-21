import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int[]count=new int[10]; //array to store digits

        while(num>0){
            int digit= num%10;
            count[digit]++;
            num=num/10;
        }

        for(int i=0; i<10; i++){
            if(count[i]>0){

                System.out.println(i+ "=" + count[i]+ " times");
            }

    }
    sc.close();

}

}