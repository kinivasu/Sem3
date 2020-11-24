package random;

public class AssignmentvsEquals {
    public static void main(String[] args) {
        String s1 = new String("abcd");
        String s2 = new String("abc");

        System.out.println(s1.equals(s2)); // * false
        System.out.println(s1 == s2);// * false

        s1 = new String("abcd");
        s2 = new String("abcd");

        System.out.println(s1.equals(s2));// * true
        System.out.println(s1 == s2);// * false
    }
}
// ! Note
// * For primitive datatypes, == compares values
// * For onjects its compares the references
// * equals also does the same, but for Strings it is overriden to compare the
// * values of string