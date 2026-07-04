import java.util.Scanner;

class Student {

    String name;
    int[] marks = new int[5];
    int total = 0;
    double percentage;

    // Calculate total and percentage
    void calculate() {

        total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        percentage = total / 5.0;
    }

    // Display grade
    void grade() {

        if (percentage >= 90)
            System.out.println("Grade : A+");
        else if (percentage >= 80)
            System.out.println("Grade : A");
        else if (percentage >= 70)
            System.out.println("Grade : B");
        else if (percentage >= 60)
            System.out.println("Grade : C");
        else if (percentage >= 40)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : Fail");
    }

    // Display failed subjects
    void failedSubjects() {

        System.out.print("Failed Subjects: ");

        boolean fail = false;

        for (int i = 0; i < 5; i++) {

            if (marks[i] < 40) {
                System.out.print("Subject " + (i + 1) + " ");
                fail = true;
            }
        }

        if (!fail)
            System.out.print("None");

        System.out.println();
    }
}

public class q5classo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[3];

        // Input
        for (int i = 0; i < 3; i++) {

            s[i] = new Student();

            System.out.print("\nEnter Student Name: ");
            s[i].name = sc.next();

            System.out.println("Enter marks of 5 subjects:");

            for (int j = 0; j < 5; j++) {
                s[i].marks[j] = sc.nextInt();
            }

            s[i].calculate();
        }

        // Display Details
        System.out.println("\nStudent Details");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nName : " + s[i].name);
            System.out.println("Total = " + s[i].total);
            System.out.println("Percentage = " + s[i].percentage);

            s[i].grade();

            s[i].failedSubjects();
        }

        // Find Rank
        int rank = 1;

        for (int i = 1; i < 3; i++) {

            if (s[i].total > s[rank - 1].total)
                rank = i + 1;
        }

        System.out.println("\nClass Rank 1 : " + s[rank - 1].name);

        sc.close();
    }
}
