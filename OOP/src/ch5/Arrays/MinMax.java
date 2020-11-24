package ch5.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 77, 33, 1, 10, -33 };

        int min, max;
        min = max = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Max Element is: " + max);
        System.out.println("Min Element is: " + min);
    }
}

// ? Max Element is: 77
// ? Min Element is: -33