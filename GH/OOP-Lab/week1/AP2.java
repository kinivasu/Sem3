import java.util.*;
class AP2 
{
	static int findSum(int n) 
	{
		if (n == 0)
			return 0;
		return (int)(n%10) + findSum(n/10);
	}
	public static void main(String []args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("\tEnter a number: ");
		int n = sc.nextInt();
		System.out.println("\n\tThe sum of digits of "+n+" is = "+findSum(n)+".\n\n");
	}	
}