class Veh {
    void start() {
        System.out.println("Vehicle started!!");
    }
}

class Carr extends Veh {
    void drive() {
        System.out.println("Car driving!!");
    }
}

class SportsCar extends Carr {
    @Override
    void drive() {
        System.out.println("Sports car driving fast!!");
    }
}

public class q6inheritence {
    public static void main(String[] args) {
        Veh v = new Veh();
        v.start();

        Carr c = new Carr();
        c.start();
        c.drive();

        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
    }
}
