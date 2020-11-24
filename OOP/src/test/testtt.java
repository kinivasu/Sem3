package test;

class MIT {
    int c = 0;

    MIT() {
        // System.out.println("Inside superclass constructor");
        increment();
    }

    void increment() {
        c = c + 50;
    }

    void display() {
        System.out.println(c);
        ;
    }
}

class ICT extends MIT {
    ICT() {
        // System.out.println("Inside sublcass constructor");
        increment();
    }

    void increment() {
        // System.out.println("Inside sublcass method");
        c = c + 100;
    }
}

public class testtt {
    public static void main(String[] args) {
        MIT m = new ICT();
        m.display();
    }
}

// Inside superclass constructor
// Inside sublcass method
// Inside sublcass constructor
// Inside sublcass method
// 200

// ! EXPLANATION ans:200
// * Superclass method increment() is hidden by the suclass method
// * so both the time c=c+100;