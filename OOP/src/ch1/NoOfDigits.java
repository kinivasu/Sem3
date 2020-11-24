package ch1;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int num = obj.nextInt();

        int digits = (int) Math.log10(num) + 1;
        System.out.println("The number " + num + " has " + digits + " digits.");
        obj.close();
    }
}