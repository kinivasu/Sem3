package ch4;

class Complex {
    int x, y;

    Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Complex Number is:" + x + "+" + y + "i");
    }

    Complex addComplex(Complex c1) {
        int xsum = x + c1.x;
        int ysum = y + c1.y;
        return new Complex(xsum, ysum);
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 2);
        Complex c2 = new Complex(11, 3);
        c1.display();
        c2.display();

        System.out.print("After sum: ");
        // (c1.addComplex(c2)).display(); or Alter
        Complex c3 = c1.addComplex(c2);
        c3.display();

    }
}
