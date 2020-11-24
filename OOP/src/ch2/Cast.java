package ch2;

public class Cast {
    public static void main(String[] args) {
        byte b = (byte) 256;// 256-256
        byte b1 = (byte) 128;// 128-256
        byte b2 = (byte) 512;// 512-256-256
        byte b3 = (byte) 384;
        byte b4 = (byte) -130;// 126
        // -129 will give 127 .....
        // (n-256)%256
        System.out.println(b + " " + b1 + " " + b2 + " " + b3 + " " + b4);
        int i;
        byte q = (byte) 123;
        i = q * q;// ok
        // q=q*q;exceeds space of byte size
        System.out.println(i);
        char c1 = 'b';
        char c2 = 'c';
        // char c3=c1+c2;not allowed
        char c3 = (char) (c1 + c2);
        System.out.println(c3);

        // In c++ it would have worked as positive numbers are defined as bool=1
        // boolean a=(boolean)5;
        // System.out.println(a);
        char p1 = 'a';
        char q1 = 'b';
        System.out.println(p1 + q1);
        char pq = (char) (p1 + q1);
        System.out.println(pq);
        String s = "JAVA STRING QUIZ";
        System.out.println(s);
        System.out.println(s.charAt((s.length())));
    }

}
