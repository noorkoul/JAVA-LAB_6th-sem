// Parent Class
class Vehicle {

    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Child Class
class Car extends Vehicle {

    void drive() {
        System.out.println("Driving a car");
    }
}

// Child Class
class Bike extends Vehicle {

    void drive() {
        System.out.println("Driving a bike");
    }
}

public class q10inheritence {

    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        c.drive();
        b.drive();
    }
}
