package ch2;

/**
 * TypeCaste3
 */
public class TypeCaste3 {
    public static void main(String[] args) {
        // Demonstrate casting.
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X
        ch = (char) b;
        System.out.println("ch: " + ch);

        int a = 130;
        byte m = (byte) a;
        System.out.println(a);
        System.out.println(m);
    }
}