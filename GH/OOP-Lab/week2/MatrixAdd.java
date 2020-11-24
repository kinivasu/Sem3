import java.util.Scanner;

class P4 {
    String id;
    int m, n;
    int mat[][];
    Scanner sc = new Scanner(System.in);

    public P4(int m, int n) {
        this.m = m;
        this.n = n;
        this.mat = new int[m][n];
    }

    public P4(String id) {
        this.id = id;
        this.m = 0;
        this.n = 0;
        this.mat = new int[0][0];
    }

    public void input() {
        System.out.print("Enter dimensions of the matrix " + id + " : ");
        this.m = sc.nextInt();
        this.n = sc.nextInt();
        this.mat = new int[m][n];
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter a[" + i + "][" + j + "] : ");
                this.mat[i][j] = sc.nextInt();
            }
        }
    }

    public static P4 add(P4 a, P4 b) {
        P4 c = new P4(a.m, a.n);
        if (a.m == b.m && a.n == b.n) {
            for (int i = 0; i < a.m; i++) {
                for (int j = 0; j < a.n; j++) {
                    c.mat[i][j] = a.mat[i][j] + b.mat[i][j];
                }
            }
            return c;
        } else {
            System.err.println("901. DIMENSION ERROR");
        }
        return null;
    }
}

public class MatrixAdd {
    public static void main(String[] args) {
        P4 a = new P4("A");
        P4 b = new P4("B");
        a.input();
        b.input();
        P4 c = P4.add(a, b);
        c.id = "A+B";
        System.out.println("\n\n" + a + "\n" + b + "\n" + c);
    }
}
