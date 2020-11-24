package ch2;

//* AUTOMATIC TYPECASTING using SHORTHAND OPERATOR 
//? https://stackoverflow.com/questions/8710619/why-dont-javas-compound-assignment-operators-require-casting
//? https://www.javatpoint.com/java-char-to-int
//? https://stackoverflow.com/questions/13781069/implicit-conversion-in-java-operator
//? https://stackoverflow.com/questions/43862598/shorthand-operator-in-java-gives-two-different-result

public class TypeCaste2 {
    public static void main(String[] args) {
        short x = 3;
        x += 4.6;
        System.out.println(x); // ? Prints 7 Reason-> i += j is a shortcut for i = (type of i) (i + j)
    }
}
