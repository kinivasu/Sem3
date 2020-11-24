package ch7.abstractclassvehicle;

import javax.swing.*;

public class SailBoat extends Vehicle {
    private int length;

    public SailBoat() {
        super("wind", 0);
        setLength();
    }

    public void setLength() {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter SailBOat Length:  ");
        length = Integer.parseInt(entry);
    }

    public int getLength() {
        return length;
    }

    public void setPrice() {
        final int MAX = 100000;
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter SailBOat Price:  ");
        price = Integer.parseInt(entry);
        if (price > MAX)
            price = MAX;
    }

    // overriding the toString method present in the object class
    public String toString() {
        return ("The " + getLength() + " foot SailBoat is powered by " + getPowerSource() + " and has " + getWheels()
                + " wheels and costs " + getPrice());
    }
}