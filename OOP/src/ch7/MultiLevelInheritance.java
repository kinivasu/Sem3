package ch7;

class Vehicle {
    private double mileage;
    private double tankVolume;

    Vehicle() {
    }

    Vehicle(double mileage, double tankVolume) {
        this.mileage = mileage;
        this.tankVolume = tankVolume;
    }

    // Getters and Setters, Accessor MEthods
    double getTankVolume() {
        return tankVolume;
    }

    double getMileage() {
        return mileage;
    }

    void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    void setMileage(double mileage) {
        this.mileage = mileage;
    }

}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Main Function");
    }
}
