package ch2;

class LeapYear {
    public static void main(String args[]) {
        int year = 1900;
        boolean isLeap;
        // isLeap = year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? true : false)
        // : false) : false;
        isLeap = year % 100 == 0 ? (year / 100) % 4 == 0 : year % 4 == 0;
        System.out.println(isLeap);
    }
}