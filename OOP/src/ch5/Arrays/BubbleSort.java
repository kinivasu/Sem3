package ch5.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 100, 2, 13, 45, 99, 1, 0, -99 };

        int len = a.length;

        for (int i = 1; i < len; i++) { // * Basically n-1 passes
            for (int j = len - 1; j >= i; j--) { // * For each pass iterate through the non sorted ekements
                if (a[j - 1] > a[j]) { // * Note in this case j-1 and j beacuse array out of Bound must be considered
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int x : a) {
            System.out.println(x);
        }
    }
}
