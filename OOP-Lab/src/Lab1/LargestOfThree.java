package Lab1;

import java.util.Scanner;

public class LargestOfThree {

    public static double getLargest(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3)
            return num1;
        else if (num2 >= num1 && num2 >= num3)
            return num2;
        else
            return num3;
    }
    // * alter
    // * (a>b)? (a>c)?a:c : (b>c)?b:c;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        System.out.println("The largest of the 3 numbers is: " + getLargest(num1, num2, num3));

        obj.close();
    }
}