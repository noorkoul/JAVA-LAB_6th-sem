// Parent Class
class Animal {

    void move() {
        System.out.println("The animal is moving");
    }
}

// Child Class
class Bird extends Animal {

    void move() {
        System.out.println("The bird is flying");
    }
}

// Child Class
class Fish extends Animal {

    void move() {
        System.out.println("The fish is swimming");
    }
}

public class q11inheritence {

    public static void main(String[] args) {

        Bird b = new Bird();
        Fish f = new Fish();

        b.move();
        f.move();
    }
}