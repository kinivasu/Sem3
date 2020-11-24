//* https://stackoverflow.com/questions/22458575/whats-the-difference-between-next-and-nextline-methods-from-scanner-class#:~:text=differences%20are...-,next()%20can%20read%20the%20input%20only%20till%20the%20space,end%20of%20line%20%5Cn).
//? next() considers a token of characters till a space is encountered
//? nextline() considers the entire line
package ch2;

import java.util.Scanner;

public class NextvsNextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        System.out.println("c is " + c);
        System.out.println("enter string for d");
        String d = sc.next();
        System.out.println("d is " + d);
        sc.close();
    }
}
