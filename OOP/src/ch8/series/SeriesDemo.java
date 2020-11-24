package ch8.series;

interface Series {
    int getNext(); // return next number in series

    void reset(); // restart

    void setStart(int x); // set starting value
}

class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

public class SeriesDemo {
    public static void main(String[] args) {

        ByTwos ob2 = new ByTwos();
        ByThrees ob3 = new ByThrees();

        System.out.println("ByTwo Series: ");
        System.out.println("Starting at: " + ob2.val);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob2.getNext());

        System.out.println("ByThree Series: ");
        ob3.reset();
        System.out.println("Starting at: " + ob3.val);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob3.getNext());

        System.out.println("ByTwo Series: ");
        ob2.setStart(100);
        System.out.println("Starting at: " + ob2.val);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob2.getNext());
    }
}

// ! The above can also be done using interface reference
// public class SeriesDemo {

// public static void main(String[] args) {
// ByTwos ob2 = new ByTwos();
// ByThrees ob3 = new ByThrees();

// Series iRef; // Interface Reference

// System.out.println("Series.....");

// for (int i = 0; i < 5; i++) {
// iRef = ob2; // Refers to ByTwos object
// System.out.println("ByTwos Next value: " + ob2.getNext());
// iRef = ob3; // Refers to ByThrees object
// System.out.println("ByThrees Next value: " + ob3.getNext());
// }

// }
// }``
