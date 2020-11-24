package ch6;

import java.util.*;

//* Stack implementatioon using Arrays!!
class Stack {
    int stack[];// Stack implementation using arrays
    int tos;// top of stack

    Stack(int size) {
        // Initialize a stack of size "size"
        stack = new int[size]; // variable stack was declared earlier as an instace variable, now assigned
        tos = -1;
    }

    void push(int value) {
        if (tos == stack.length - 1)
            System.out.println("Stack Overflow!!!");
        else
            stack[++tos] = value;
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack UnderFlow!!!");
            return -9999;
        } else
            return stack[tos--];
    }

    void display() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= tos; i++) {
            System.out.println(stack[i] + "   ");
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Stack: ");
        int size = sc.nextInt();
        Stack st1 = new Stack(size);
        // st1.display();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.display();
        // st1.pop();
        st1.display();
        sc.close();
    }
}
