import java.util.Scanner;
public class q10array {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();   // Consume newline

        String[] arr = new String[n];

        // Input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Sort alphabetically
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display sorted strings
        System.out.println("\nStrings in alphabetical order:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Find longest string
        String longest = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }

        System.out.println("\nLongest String: " + longest);

        sc.close();
    }
    
}
