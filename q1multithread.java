// Thread created by extending Thread class
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

// Thread created by implementing Runnable interface
class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class q1multithread {

    public static void main(String[] args) {

        // Thread using Thread class
        MyThread t1 = new MyThread();

        // Thread using Runnable interface
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);

        // Start both threads
        t1.start();
        t2.start();
    }
}