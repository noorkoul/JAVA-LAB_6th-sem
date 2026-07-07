class NumberThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Number Thread Interrupted.");
        }
    }
}

class LetterThread extends Thread {

    public void run() {
        try {
            for (char ch = 'A'; ch <= 'E'; ch++) {
                System.out.println("Letter Thread: " + ch);
                Thread.sleep(700);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Letter Thread Interrupted.");
        }
    }
}

public class q4multithread {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();

        t1.start();
        t2.start();
    }
}