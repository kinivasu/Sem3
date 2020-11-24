package ch1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter three numbers:  ");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();

        System.out.println("The Largest among the three  is:  " + largest(num1, num2, num3));
        myObj.close();
    }

    static int largest(int a, int b, int c) {
        if (a > b && b > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }
}