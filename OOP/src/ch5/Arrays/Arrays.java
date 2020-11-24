package ch5.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };

        // ? FOR EACH LOOP , no index involved Remember
        for (int x : a) {
            System.out.println(x);
        }

        System.out.println("Array Length is :" + a.length);
    }
}