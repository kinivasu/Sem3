package ch5.Strings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello"; // ! Without usage of "new" keyword then is stored in a shared pool
                             // ! Example String s4="hello"; s4 is a reference of s1 location only
        String s2 = new String("Hello Ji Namaste"); // ! using the "new" keyword, not a shared pool, separate locations
        String s3 = new String(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

// ? 2 ays to create Strings 1. Without using new 2. Using new
// ! NOTE Strings are immutable!!! Characters can be accessed but not changed