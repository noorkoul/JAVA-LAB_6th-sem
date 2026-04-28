import java.util.Scanner;

public class q3array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        System.out.println("Element found at position : ");

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(i + 1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
