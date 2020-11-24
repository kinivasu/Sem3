package ch5.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Namaste");
        String s3 = new String("Namaste");

        // equals is a non static method, so it must be in the form object.method()
        // and takes another string as parameter to compare
        System.out.println(s1.equals(s2));// * false
        System.out.println(s2.equals(s3));// * true
        // ! cant use s1==s2 because that means whether s1 and s2 are refernece to the
        // ! same obj or not

        // .length() for String is a method , whereas .length for arrays is a property
        System.out.println(s1.length());

        System.out.println(s2.charAt(0));

        // 0 if same , -ve if s1<s2 , +ve if s1>s2
        System.out.println(s1.compareTo(s2)); // * returns a -ve no. as s1<s2
        System.out.println(s2.compareTo(s3)); // * returns 0 as s2=s3
        System.out.println(s2.compareTo(s1)); // * returns a -ve no. as s1<s2

        // returns the first index f the substring occuring in the given string
        // -1 if not present
        System.out.println(s3.indexOf("ast"));

        String s4 = new String("hahahahaha");
        // last index of given substring, -1 on failure
        System.out.println(s4.lastIndexOf("ha"));

        System.out.println(s4.substring(2, 4));
    }
}
