package ch7.abstractclassvehicle;

public abstract class Vehicle {

    // attributes or instance variables
    private String powerSource;
    private int wheels;
    protected int price;// sublclasses can access the protected variables direct;y

    public Vehicle(String powerSource, int wheels) {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    // * Getter Methods
    public String getPowerSource() {
        return powerSource;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPrice() {
        return price;
    }

    // * Setter methods
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // * this is an abstract method
    public abstract void setPrice();
}

// ! Check L10 time 1:00
// public class VehicleDemo {
// public static void main(String[] args) {

// }
// }
