import java.util.Scanner;
public class q8array {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        // Input number of classes, students and subjects
        System.out.print("Enter number of classes: ");
        int classes = sc.nextInt();

        System.out.print("Enter number of students in each class: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Declare 3D array
        int[][][] marks = new int[classes][students][subjects];

        // Input marks
        for (int i = 0; i < classes; i++) {
            System.out.println("Enter marks for Class " + (i + 1));

            for (int j = 0; j < students; j++) {
                System.out.println("Student " + (j + 1));

                for (int k = 0; k < subjects; k++) {
                    System.out.print("Subject " + (k + 1) + ": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        // Calculate total marks
        System.out.println("\nTotal Marks of Each Student:");

        for (int i = 0; i < classes; i++) {

            System.out.println("Class " + (i + 1));

            for (int j = 0; j < students; j++) {

                int total = 0;

                for (int k = 0; k < subjects; k++) {
                    total += marks[i][j][k];
                }

                System.out.println("Student " + (j + 1) + " = " + total);
            }
        }

        sc.close();
    }
}

