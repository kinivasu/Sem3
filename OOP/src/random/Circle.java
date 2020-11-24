package random;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 0.0;
        this.color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4.2, "Blue");
        System.out.println("Radius of c1 = " + c1.getRadius());
        System.out.println("Color pf c1 - " + c1.getColor());
        System.out.println("Area of c1 = " + c1.getArea());
        System.out.println("Radius of c2 = " + c2.getRadius());
        System.out.println("Color pf c2 - " + c2.getColor());
        System.out.println("Area of c2 = " + c2.getArea());
    }
}