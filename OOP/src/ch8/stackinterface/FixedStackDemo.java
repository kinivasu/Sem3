package ch8.stackinterface;

// ! FIXED STACK
class FixedStack implements StackInterface {
    private int stack[];
    private int tos;

    // Constructor to allocate and initialize stack using
    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public boolean isFull() {
        return (tos == stack.length - 1);
    }

    public boolean isEmpty() {
        return (tos == -1);
    }

    public void push(int item) {
        if (isFull())
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow.");
            return -1;
        } else
            return stack[tos--];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Empty Stack.");
        else

            for (int i = 0; i <= tos; i++)
                System.out.println(stack[i] + " ");
    }
}

public class FixedStackDemo {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);

        // push some numbers onto the stack
        for (int i = 0; i < 5; i++)
            mystack1.push(i * 10);

        mystack1.display();
        System.out.println("");
        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

    }
}
