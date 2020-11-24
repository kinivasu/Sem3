package ch5.Strings;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        // s1 and s2 now point at the same string - "Hello"

        s1 = "Help!";
        System.out.println(s2); // still prints "Hello"
    }

}
