import java.util.Scanner;

public class q1array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int sum = 0;

        System.out.println("Enter the elements:");

        arr[0] = sc.nextInt();
        int min = arr[0];
        int max = arr[0];
        sum = arr[0];
        // sum
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

            // minimum and maximum

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("sum= " + sum);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum= " + max);
        System.out.println("Average= " + average);

    }

}
