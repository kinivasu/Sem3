package test;

class Stone implements Runnable {
    static int id = 1;
    Thread thrd;

    Stone(String s) {
        thrd = new Thread(this, s);
        thrd.start();
    }

    public void run() {
        try {
            id--;
            if (id == 0) {
                pick();
            } else {
                release();
            }
        } catch (Exception e) {
            // ---
        }
    }

    private synchronized void pick() throws Exception {
        System.out.print(Thread.currentThread().getName() + " ");
        System.out.print("P ");
        Thread.sleep(500);
        System.out.print("Q ");
    }

    private synchronized void release() throws Exception {
        System.out.print(Thread.currentThread().getName() + " ");
        System.out.print("R ");
        Thread.sleep(500);
        System.out.println("S ");
    }

}

public class StoneTest {
    public static void main(String[] args) {

        new Stone("Thread-1");
        new Stone("Thread-2");
        Stone.id++;
    }

}