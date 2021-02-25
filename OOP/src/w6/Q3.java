package w6;

class Q {
    int n;
    boolean setvalue = false;

    synchronized void put(int n) {
        while (setvalue)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        setvalue = true;
        System.out.println("Put:" + n);
        notify();
    }

    synchronized int get() {
        while (!setvalue)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got:" + n);
        setvalue = false;
        notify();
        return n;
    }
}

class producer implements Runnable {
    Q q;

    producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class consumer implements Runnable {
    Q q;

    consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();

    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

class Q3 {
    public static void main(String args[]) {
        Q q = new Q();
        new producer(q);
        new consumer(q);
        System.out.println("Press Control -c to stop");
    }
}