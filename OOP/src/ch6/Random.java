//* Program to generate a number between 1 and 10
package ch6;

public class Random {

    // Static method can be called without an object of the class has been created
    static int randomNumber() {
        while (true) {
            // random method returns a double value between 0 and 1
            int num = (int) (Math.random() * 10);
            if (num > 0 && num < 10)// In this program this line is redundant, but if question was
                                    // random number between 5 and 10 then num>5 && num<10 can be done
                return num;
        }
    }

    public static void main(String[] args) {
        System.out.println(randomNumber());
    }
}