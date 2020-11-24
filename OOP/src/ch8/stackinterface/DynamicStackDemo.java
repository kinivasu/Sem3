package ch8.stackinterface;

// ! GROWING STACK
// Implement a "growable" stack.
class DynamicStack implements StackInterface {
    // ** all the variables and methods are same except push
    private int stack[];
    private int tos;

    DynamicStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public boolean isFull() {
        return (tos == stack.length - 1);
    }

    public boolean isEmpty() {
        return (tos == -1);
    }

    // Push an item onto the stack
    public void push(int item) {
        // if stack is full, allocate a larger stack
        if (isFull()) {
            int temp[] = new int[stack.length * 2]; // double size
            for (int i = 0; i < stack.length; i++)
                temp[i] = stack[i];
            stack = temp;
            stack[++tos] = item;
        } else
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

public class DynamicStackDemo {
    public static void main(String args[]) {
        DynamicStack mystack1 = new DynamicStack(5);

        // these loops cause each stack to grow
        for (int i = 0; i < 12; i++)
            mystack1.push(i);

        mystack1.display();
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());

    }
}