package w6;

import java.util.Scanner;

class matadd implements Runnable {
    int arr[];
    int sum = 0;
    Thread t;

    matadd(int a[]) {
        t = new Thread(this);
        arr = a;
        t.start();
    }

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    }

}

class Rowsum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix:   ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.print("Enter elements:   ");
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }

        matadd ob[] = new matadd[m];
        for (int i = 0; i < mat.length; i++) {
            ob[i] = new matadd(mat[i]);
        }
        try {
            for (int i = 0; i < mat.length; i++)
                ob[i].t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        int msum = 0;
        for (int i = 0; i < mat.length; i++)
            msum += ob[i].sum;
        System.out.println("Sum=" + msum);
    }
}