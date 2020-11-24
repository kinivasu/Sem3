package ch6;

public class Overloaded {
    static double fun(int x, double y) {
        return x + y;
    }

    static double fun(double x, int y) {
        return x + y + 1;
    }

    public static void main(String[] args) {
        fun(3, 3.14);
        // fun(3, 3); // Ambiguity arises but why
        // fun(3.14, 3.14); // Ambiguity arises but why
        fun(3.14, 3);
    }
}
