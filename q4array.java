import java.util.Scanner;

public class q4array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // FIRST ARRAY
        System.out.println("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of first array:  ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();

        }

        // SECOND ARRAY
        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // MERGED ARRAY
        int[] merged = new int[n1 + n2];

        // Array 1 in merged
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        // Array 2 in merged
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        // sort: bubble sort
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    // swap
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }
        System.out.println("Merged and sorted array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i] + "");
        }
    }
}
