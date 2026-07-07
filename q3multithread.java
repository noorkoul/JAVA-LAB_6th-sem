class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                "Thread Name: " + getName() +
                " | Priority: " + getPriority() +
                " | Count: " + i
            );
        }
    }
}

public class q3multithread {

    public static void main(String[] args) {

        PriorityThread high = new PriorityThread("HighPriority");
        PriorityThread medium = new PriorityThread("MediumPriority");
        PriorityThread low = new PriorityThread("LowPriority");

        // Set priorities
        high.setPriority(Thread.MAX_PRIORITY);      // 10
        medium.setPriority(Thread.NORM_PRIORITY);   // 5
        low.setPriority(Thread.MIN_PRIORITY);       // 1

        // Start threads
        high.start();
        medium.start();
        low.start();
    }
}