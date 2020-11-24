package ch8.stackinterface;

//* RUN TIME POLYMORPHISM!!!
//*  Accessing multiple implementations of an interface through an interface reference variable 
//* is the most powerful way that Java achieves run-time polymorphism.
//? Just like Superclass ref to subclass objects

public class StackDemo {
    public static void main(String args[]) {

        // ? INTERFACE REFERENCE
        StackInterface mystack;
        // ? CLASS REFERENCE and assignment
        DynamicStack ds = new DynamicStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // load dynamic stack
        // push some numbers onto the stack
        for (int i = 0; i < 12; i++)
            mystack.push(i);

        mystack = fs; // load fixed stack
        for (int i = 0; i < 8; i++)
            mystack.push(i);

        mystack = ds;
        System.out.println("Values in dynamic stack:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Values in fixed stack:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }

}
