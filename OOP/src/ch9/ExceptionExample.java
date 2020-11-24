package ch9;

public class ExceptionExample {
    public static void main(String args[]) {
        try {
            // code that may raise exception
            int data = 100 / 0;
            System.out.println(data);// * NOTE anything after the exception is encountered is not excecuted . Control
                                     // * shifts to the catch block or finally block
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // rest code of the program
        System.out.println("rest of the code...");
    }
}
