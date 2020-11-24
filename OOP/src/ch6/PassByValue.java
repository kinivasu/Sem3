package ch6;

class Test1 {
    /*
     * This method causes no change to the arguments used in the call.
     */
    void fun(int i, int j) {
        i = i * 2;
        j = j / 2;
    }
}

public class PassByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.fun(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}

// a and b before call: 15 20
// a and b after call: 15 20