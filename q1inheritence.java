class Vehicle {

    void start() {
        System.out.println("Vehicle Started!");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car Started!");
    }
}

public class q1inheritence {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start();

    }

}
