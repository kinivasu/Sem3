package ch5.Strings;

public class CommandLineArgs {
    public static void main(String args[]) {
        // Display all command-line information. entered from the console
        System.out.println("There are " + args.length + " command-line arguments.");
        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}

// ! Compile first, javac CommandLineArgs
// ! java CommandLineArgs one two three
// in the previous statement one two three are command line arguments
// ? o/p :
// * There are 3 command-line arguments.
// * They are:
// * arg[0]: one
// * arg[1]: two
// * arg[2]: three