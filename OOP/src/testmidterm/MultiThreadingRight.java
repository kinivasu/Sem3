package testmidterm;

class Counter {
    private int count = 3;
    boolean valueSet = false;

    synchronized void increment() throws InterruptedException { // 0.5M
        while (!valueSet)
            try {
                System.out.println("increment waiting since count equals 3");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("increment : " + ++count);
        if (count == 3) {
            valueSet = false;
            notify();
        }
        Thread.sleep(500);
    }

    synchronized void decrement() throws InterruptedException { // 0.5Mwhile(valueSet)
        try {
            System.out.println("decrement waiting since count equals 0");
            wait();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("decrement : " + --count);
        if (count == 0) {
            valueSet = true;
            notify();
        }
        Thread.sleep(500);
    }
}

class Incrementor implements Runnable { // 1M
    Counter q;

    Incrementor(Counter q) {
        this.q = q;
        new Thread(this, "Incrementor").start();
    }

    public void run() {
        while (true) {
            try {
                q.increment();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
    }
}

class Decrementor implements Runnable { // 1M
    Counter q;

    Decrementor(Counter q) {
        this.q = q;
        new Thread(this, "Decrementor").start();
    }

    public void run() {
        while (true) {
            try {
                q.decrement();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
    }
}

class CounterTest {
    // 0.5M
    public static void main(String args[]) {
        Counter q = new Counter();
        new Incrementor(q);
        new Decrementor(q);
        System.out.println("Press Control-C to stop.");
    }
}