package ch8.nestedinterface;

interface A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }

    void doSomething();
}

// * Must be accesed using dot operator!
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("This won't be displayed");
    }
}