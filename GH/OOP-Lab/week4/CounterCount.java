class Counter
{
	static int counter;
	Counter()
	{
		++counter;
		System.out.println("\t\tObject "+counter+" initialized");
	}
	public static void showCount()
	{

		System.out.println("\n\n\t\t\tObjects Declared:"+counter);
	}
}

class CounterCount
{
	public static void main(String[] args)
	{
		System.out.println();
		Counter ob1,ob=new Counter();
		for(int i=0;i<9;i++)
		{
			ob1=new Counter();
		}
		Counter.showCount();
	}
}