// Parent Class
class Person {

    void speak() {
        System.out.println("The person is speaking");
    }
}

// Child Class
class Student extends Person {

    void speak() {
        System.out.println("The student is asking a question");
    }
}

// Child Class
class Teacher extends Person {

    void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}

public class q13inheritence{

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.speak();
        t.speak();
    }
}