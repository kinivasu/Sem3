package ch1;

public class GalToLit {
    public static void main(String[] args) {
        double gallons; // holds the number of gallons
        double liters; // holds conversion to liters

        gallons = 100;

        liters = gallons * 3.7854; // convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}