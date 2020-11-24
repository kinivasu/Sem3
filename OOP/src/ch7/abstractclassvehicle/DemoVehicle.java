package ch7.abstractclassvehicle;

public class DemoVehicle {
    public static void main(String[] args) {
        SailBoat aBoat = new SailBoat();
        Bicycle aCycle = new Bicycle();

        System.out.println(aBoat);
        System.out.println(aCycle);
        // SailBoat aBoat1 = new SailBoat();
        // SailBoat aBoat2 = new SailBoat();
        // aBoat1 = aBoat2;

        // System.out.println(aBoat1 == aBoat2);
        // System.out.println(aBoat1.equals(aBoat2));
    }
}
