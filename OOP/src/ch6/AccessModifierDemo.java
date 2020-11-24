package ch6;

class TestClass {
    int a;
    public int b;
    private int c;
    protected int d;

    // setter for c;
    void setc(int var) {
        c = var;
    }

    // getter for c
    int getc() {
        return c;
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        TestClass ob = new TestClass();

        ob.a = 10;
        ob.b = 100;
        ob.setc(1000);
        ob.d = 100;

        System.out.println("The values of a,b,c are: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
