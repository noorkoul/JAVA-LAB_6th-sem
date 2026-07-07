import java.util.Scanner;

// Interface
interface Result {

    void calculateTotal();

    void calculatePercentage();

    void calculateGrade();
}

// Class implementing the interface
class Student implements Result {

    int[] marks = new int[5];
    int total = 0;
    double percentage;

    Student(int[] marks) {
        this.marks = marks;
    }

    @Override
    public void calculateTotal() {

        total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        System.out.println("Total Marks = " + total);
    }

    @Override
    public void calculatePercentage() {

        percentage = total / 5.0;

        System.out.println("Percentage = " + percentage + "%");
    }

    @Override
    public void calculateGrade() {

        if (percentage >= 90)
            System.out.println("Grade = A+");
        else if (percentage >= 80)
            System.out.println("Grade = A");
        else if (percentage >= 70)
            System.out.println("Grade = B");
        else if (percentage >= 60)
            System.out.println("Grade = C");
        else if (percentage >= 50)
            System.out.println("Grade = D");
        else
            System.out.println("Grade = F");
    }
}

// Main Class
public class q3interex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Result student = new Student(marks); // Runtime Polymorphism

        System.out.println("\n----- Result -----");

        student.calculateTotal();
        student.calculatePercentage();
        student.calculateGrade();

        sc.close();
    }
}