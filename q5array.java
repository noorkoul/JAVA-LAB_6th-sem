import java.util.Scanner;

public class q5array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // ROW SUM
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Sum of row" + (i + 1) + "= " + sum);
        }

        // COLUMN SUM
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Sum of column" + (j + 1) + " = " + sum);
        }

    }

}
