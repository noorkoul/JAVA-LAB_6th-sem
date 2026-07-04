import java.util.Scanner;
public class q6array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols=sc.nextInt();

        int A[][]= new int[rows][cols];
        int B[][]= new int[rows][cols];
        int add[][]= new int[rows][cols];
        int sub[][]= new int[rows][cols];

        System.out.println("Enter the elements of the first matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                A[i][j]=sc.nextInt();

            }
        }

         System.out.println("Enter the elements of the second matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                B[i][j]=sc.nextInt();

            }
        }
        //perform addition and subtraction
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                add[i][j]=A[i][j]+B[i][j];
                sub[i][j]=A[i][j]-B[i][j];

            }
        }

        //display addition matrix
        System.out.println("The addition matrix:");
          for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               System.out.print(add[i][j]+ " ");

            }
            System.out.println();
        }

        //display subtraction matrix
        System.out.println("The subtraction matrix:");
          for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               System.out.print(sub[i][j]+ " ");

            }
            System.out.println();
        }

        sc.close();

    }
    
}
