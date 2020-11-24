import java.util.*;

class LinkedList<T>
{
	LinkedList<?> ob;
	T a;
	LinkedList(boolean t)
	{
	}
	LinkedList(T sub)
	{
		this.a = sub;
		link();
	}
	void link()
	{
		this.ob = new LinkedList<T>(true);
	}
	LinkedList retptr()
	{
		return ob;
	}
}

class Driver
{
	public static void main(String[] args)
	{
		LinkedList<Integer> obj = new LinkedList<Integer>(10);
		LinkedList<Integer> obj2 = obj.retptr();
	}
}