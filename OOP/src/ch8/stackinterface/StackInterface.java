package ch8.stackinterface;

interface StackInterface {
    void push(int item); // store an item

    int pop(); // retrieve an item

    boolean isEmpty(); // return true if stack is empty

    boolean isFull(); // return true if stack is full
}