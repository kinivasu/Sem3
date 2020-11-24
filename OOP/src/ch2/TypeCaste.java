package ch2;

import java.util.Scanner;

public class TypeCaste {
  public static void main(String[] argv) {
    Scanner obj = new Scanner(System.in);
    char ch = obj.nextLine().charAt(0);
    int num = ch;
    // int num2= Character.getNumericValue(ch);

    System.out.println(num);
    // System.out.println(num2);
    obj.close();
  }
}