package generics;

import java.lang.reflect.Array;

class PushException extends Exception {
	public PushException(String s) {
		super(s);
	}
}

class PopException extends Exception {
	public PopException(String s) {
		super(s);
	}
}

class Stack<T> {
	T item[];
	int top;
	int size;

	public Stack(Class<T[]> claz, int length) {
		this.size = length;
		this.item = claz.cast(Array.newInstance(claz.getComponentType(), length));
		this.top = -1;
	}

	public boolean isEmpty() {
		if (this.top == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (this.top == this.size - 1)
			return true;
		return false;
	}

	public boolean push(T elem) throws PushException {
		if (this.isFull())
			throw new PushException("Stack is Full");
		this.item[++this.top] = elem;
		return true;
	}

	public T pop() throws PopException {
		if (this.isEmpty())
			throw new PopException("Stack is Empty");
		return (this.item[this.top--]);
	}

	// public void display(){
	// if(this.isEmpty())
	// return;
	// for(int i = 0; i < this.top + 1; i++)
	// System.out.print(this.item[i]+" ");
	// System.out.println("");
	// }
}

class Student {

	String name;
	int reg_no;

	Student(String name, int reg_no) {
		this.name = name;
		this.reg_no = reg_no;
	}
}

class Employee {
	String name;
	int emp_id;

	Employee(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;
	}
}

public class Q2 {
	public static void main(String[] args) {

		System.out.println("Creating stack object for type Student with size 2");
		Stack<Student> s1 = new Stack<Student>(Student[].class, 2);

		System.out.println("Creating stack object for type Employee with size 2");
		Stack<Employee> s2 = new Stack<Employee>(Employee[].class, 2);

		try {
			System.out.println("Pushing elements to student stack");
			s1.push(new Student("VK", 123));
			s1.push(new Student("KV", 456));

			System.out.println("Displaying student stack");
			for (int i = 0; i < s1.top + 1; i++) {
				System.out.println(s1.item[i].name + " " + s1.item[i].reg_no);
			}
			System.out.println("Pushing elements to employee stack");
			s2.push(new Employee("SJ", 125));
			s2.push(new Employee("JS", 223));
			System.out.println("Displaying employee stack");
			for (int i = 0; i < s2.top + 1; i++) {
				System.out.println(s2.item[i].name + " " + s2.item[i].emp_id);
			}
		} catch (PushException ex) {
			System.out.println("Exception Occured:  " + ex);
		}
	}
}