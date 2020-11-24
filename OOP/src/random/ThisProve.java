package random;

class ThisProve {
    void m() {
        System.out.println(this);// prints same reference ID
    }

    public static void main(String args[]) {
        ThisProve obj = new ThisProve();
        System.out.println(obj);// prints the reference ID
        obj.m();
    }
}