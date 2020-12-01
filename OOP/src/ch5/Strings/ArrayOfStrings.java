package ch5.Strings;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String strs[] = { "This", "is", "a", "test." };

        System.out.println("Original array: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // change a string
        // strs[1] = "was";
        // strs[3] = "test, too!";

        // System.out.println("Modified array: ");
        // for (String s : strs)
        // System.out.print(s + " ");

        // * Length of each string
        System.out.println("Rows: " + strs.length);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i].length());
        }
    }
}
