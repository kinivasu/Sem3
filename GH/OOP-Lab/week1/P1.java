import java.util.*;

class P1
{
	public static int greatest(int a, int b,int c)
	{
		return (a>b)?(a>c)?a:c:(b>c)?b:c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		System.out.println("Enter a number:");
		int c=sc.nextInt();
		int gr=greatest(a,b,c);
		System.out.println("Greatest of em all:"+gr);
	}
}