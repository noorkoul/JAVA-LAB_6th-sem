import java.util.Scanner;

// Superclass
class Student {

    int rollNo;
    String name;
    int marks[] = new int[5];

    Student(int rollNo, String name, int marks[]) {
        this.rollNo = rollNo;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }

    void calculateGrade() {
        System.out.println("Grade Calculation");
    }
}

// UG Student
class UGStudent extends Student {

    UGStudent(int rollNo, String name, int marks[]) {
        super(rollNo, name, marks);
    }

    @Override
    void calculateGrade() {

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        double percentage = total / 5.0;

        char grade;

        if (percentage >= 80)
            grade = 'A';
        else if (percentage >= 70)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("\n------ UG Student Report ------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
    }
}

// PG Student
class PGStudent extends Student {

    PGStudent(int rollNo, String name, int marks[]) {
        super(rollNo, name, marks);
    }

    @Override
    void calculateGrade() {

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        double percentage = total / 5.0;

        char grade;

        if (percentage >= 85)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 65)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("\n------ PG Student Report ------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
    }
}

// Main Class
public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s;      // Dynamic Method Dispatch

        int choice;

        do {

            System.out.println("\n===== Student Result Processing =====");
            System.out.println("1. UG Student");
            System.out.println("2. PG Student");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll No : ");
                    int roll = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    int marks[] = new int[5];

                    System.out.println("Enter Marks of 5 Subjects:");

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }

                    s = new UGStudent(roll, name, marks);

                    s.calculateGrade();

                    break;

                case 2:

                    System.out.print("Enter Roll No : ");
                    roll = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    name = sc.nextLine();

                    marks = new int[5];

                    System.out.println("Enter Marks of 5 Subjects:");

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }

                    s = new PGStudent(roll, name, marks);

                    s.calculateGrade();

                    break;

                case 3:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
