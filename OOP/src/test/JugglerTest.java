package test;

class Juggler implements Runnable {
    Thread thrd;

    Juggler(String s) {
        thrd = new Thread(this, s);
        thrd.start();
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("e2 ");
            }
            System.out.println(Thread.currentThread().getName() + " ");
        }
    }
}

public class JugglerTest {
    public static void main(String[] args) {
        Thread.currentThread().setName("Thread-main");
        try {
            Juggler t1 = new Juggler("Thread-1");
            Juggler t2 = new Juggler("Thread-2");
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("e ");
        }
        System.out.println(Thread.currentThread().getName() + " ");
    }
}
