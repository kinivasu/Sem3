package ch1;

import java.util.*;

public class ArmstrongDemo {

    static boolean checkArmstrong(int num) {
        if (num == sumOfDigitsCube(num))
            return true;
        return false;
    }

    // * using Recursive approach here
    static int sumOfDigitsCube(int num) {
        if (num == 0)
            return 0;
        return (int) Math.pow(num % 10, 3) + sumOfDigitsCube(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\tEnter a number to check:  ");
        int num = sc.nextInt();

        if (checkArmstrong(num) == true)
            System.out.println("\n\t\t" + num + " is an ARMSTRONG NUMBER");
        else
            System.out.println("\n\t\t" + num + " is NOT AN ARMSTRONG NUMBER");
        sc.close();
    }
}