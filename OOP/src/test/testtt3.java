package test;

abstract class h1 {
    static int i;

    h1() {
        i++;
    }
}

class j1 extends h1 {
    j1() {
        i++;
    }
}

class k1 extends j1 {
}

public class testtt3 {
    public static void main(String[] args) {
        j1 jj = new j1();
        j1 kk = new k1();
        System.out.println(j1.i);
    }
}
