class PriorityDemo extends Thread {

    public PriorityDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }
}

public class q5multithread{

    public static void main(String[] args) {

        PriorityDemo t1 = new PriorityDemo("Thread-1");
        PriorityDemo t2 = new PriorityDemo("Thread-2");
        PriorityDemo t3 = new PriorityDemo("Thread-3");
        PriorityDemo t4 = new PriorityDemo("Thread-4");
        PriorityDemo t5 = new PriorityDemo("Thread-5");

        // Assign priorities
        t1.setPriority(1);   // Minimum
        t2.setPriority(3);
        t3.setPriority(5);   // Normal
        t4.setPriority(7);
        t5.setPriority(10);  // Maximum

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}