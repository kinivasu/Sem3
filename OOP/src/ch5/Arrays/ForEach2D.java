package ch5.Arrays;

import java.util.Scanner;

public class ForEach2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements are: ");

        // ! THIS IS IMPORTANT
        for (int x[] : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
        }
        sc.close();
    }
}
