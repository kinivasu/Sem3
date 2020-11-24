package testmidterm;

class Counter extends Thread {
    // variable
    private static int count;

    // constructor
    Counter(String name) {
        super(name); // naming the thread when it is created
        count = 0; // initializing integer as 0
        start();
    }

    // empty thread entry point
    public void run() {

    }

    // helper methods
    synchronized void increment() {
        if (count >= 3) {

            // (wait for count to reduce)
            System.out.println("wait for count to reduce");

            // waiting
            try {
                wait();
            } catch (InterruptedException e) {
                // printing interrupt exception
                System.out.println("==" + getName() + " Interrupted==");
            }

        } else {

            // incrementing counter
            count++;
            System.out.println("increment() function has occured, count : " + count);

            // sleeping for 500ms
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // printing interrupt exception
                System.out.println("==" + getName() + " Interrupted==");
            }

            // notify decrement thread
            notify();

        }
    }

    synchronized void decrement() {
        if (count <= 0) {

            // (wait for count to increase)
            System.out.println("wait for count to increase");

            // waiting
            try {
                wait();
            } catch (InterruptedException e) {
                // printing interrupt exception
                System.out.println("==" + getName() + " Interrupted==");
            }

        } else {

            // decrementing
            count--;
            System.out.println("decrement() function has occured, count : " + count);

            // sleeping
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // printing interrupt exception
                System.out.println("==" + getName() + " Interrupted==");
            }

            // notify increment
            notify();
        }
    }
}

public class MultiThreadingWrong {
    // main driver method
    public static void main(String[] args) {
        System.out.println("\n");

        // creating threads
        Counter incrementThread = new Counter("incrementThread");
        Counter decrementThread = new Counter("decrementThread");

        // incrementing and decrementing
        incrementThread.increment();
        incrementThread.increment();
        incrementThread.increment();
        incrementThread.increment();
        decrementThread.decrement();
        incrementThread.increment();
    }

}