package ch7;

abstract class GeometricFigure {
    int dimension;

    GeometricFigure() {
    }

    GeometricFigure(int dimension) {
        this.dimension = dimension;
    }

    abstract double area();

    // abstract double magnify();
}

class Point extends GeometricFigure {
    int x;
    int y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double area() {
        return 0;
    }
}

class Ellipse extends GeometricFigure {
    int a;
    int b;

    Ellipse() {
    }

    Ellipse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double area() {
        return Math.PI * a * b;
    }
}

class Circle extends Ellipse {

    Circle() {
    }

    Circle(int a) {
        super(a, a);
    }

    double area() {
        return Math.PI * a * a;
    }
}

class Rectangle extends GeometricFigure {
    int a;
    int b;

    Rectangle() {
    }

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double area() {
        return a * b;
    }
}

class Square extends Rectangle {

    Square() {
    }

    Square(int a) {
        super(a, a);
    }

    double area() {
        return a * a;
    }
}

public class AbstractE2 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 3);
        Ellipse e1 = new Ellipse();
        Ellipse e2 = new Ellipse(4, 5);
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7, 6);
        Square s1 = new Square();
        Square s2 = new Square(10);

        System.out.println(p1.area());
        System.out.println(p2.area());
        System.out.println(e1.area());
        System.out.println(e2.area());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
