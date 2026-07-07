// Thread 1 - Prints numbers 1 to 20
class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

// Thread 2 - Prints even numbers
class Thread2 extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Thread 2 (Even): " + i);
        }
    }
}

// Thread 3 - Prints odd numbers
class Thread3 extends Thread {
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("Thread 3 (Odd): " + i);
        }
    }
}

public class q2multithread {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}