class Person {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

class Employee extends Person {
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class q2inheritence {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Noor";
        p.age = 21;
        p.display();

        System.out.println();

        Employee e = new Employee();
        e.name = "Ella";
        e.age = 22;
        e.salary = 60000;
        e.display();
    }

}
