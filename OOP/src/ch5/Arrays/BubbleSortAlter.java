package ch5.Arrays;

public class BubbleSortAlter {
    public static void main(String[] args) {
        int a[] = { 100, 2, 13, 45, 99, 1, 0, -99 };

        int len = a.length;

        for (int i = 0; i < len - 1; i++) { // * Basically n-1 passes
            for (int j = 0; j < len - i - 1; j++) { // * For each pass iterate through the non sorted ekements
                if (a[j] > a[j + 1]) { // * Note in this case j and j+1
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int x : a) {
            System.out.println(x);
        }
    }
}
