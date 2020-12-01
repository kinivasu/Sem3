package ch5.Strings;

public class TwoDArryaStrings {
    public static void main(String[] args) {
        String[][] strs = { { "one", "two", "three", "seven" }, { "thirteen", "fifteen" },
                { "twenty seven", " twenty nine" } };

        System.out.println("Original array: \n");
        for (String row[] : strs) {
            for (String s : row)
                System.out.print(s + " ");
            System.out.println("\n");
        }

        System.out.println("No. of Rows: ");
    }
}
