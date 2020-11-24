package ch6;

class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    /*
     * Pass an object. Now, ob.a and ob.b in object used in the call will be
     * changed.
     */
    void change(Test2 o) {
        o.a = o.a * 2;
        o.b = o.b / 2;
    }
}

public class PassbyReference {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
