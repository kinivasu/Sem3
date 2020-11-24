package test;

class Counter {
    static int a, b = 10;

    static void display() {
        System.out.println("a= " + a + " b=" + b);
    }

    static {
        a = 5 * b;
    }
}

public class testtt2 {
    public static void main(String[] args) {
        Counter.display();
    }
}
