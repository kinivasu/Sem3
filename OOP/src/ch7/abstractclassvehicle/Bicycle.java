package ch7.abstractclassvehicle;

import javax.swing.*;

public class Bicycle extends Vehicle {
    public Bicycle() {
        super("A Person", 2);
    }

    public void setPrice() {
        final int MAX = 50000;
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter Bicycle Price:  ");
        price = Integer.parseInt(entry);
        if (price > MAX)
            price = MAX;
    }

    // overriding the toString method present in the object class
    public String toString() {
        return ("The Bicycle is powered by " + getPowerSource() + " and has " + getWheels() + " wheels and costs "
                + getPrice());
    }
}
