import java.util.*;
import java.lang.String;
class ISBN
{
	String ISBNcode;

	ISBN(String val)
	{
		this.ISBNcode=new String(val);
	}

	public void inputISBN()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\n\tEnter ISBN code:");
		this.ISBNcode=sc.next();
	}

	public int checkISBN()
	{
		int len=ISBNcode.length();
		if(len==10)
		{
			int sum=0;
			for(int i=0;i<10;i++)
			{
				sum+=((i+1)*ISBNcode.charAt(i));
			}
			if(sum%11==0)
			{
				return 0;
			}
			else
			{
				return 1;
			}	
		}
		return -1;
	}
}

class ISBNTest
{
	public static void main(String[] args)
	{
		ISBN ob=new ISBN("");
		ob.inputISBN();
		int val=ob.checkISBN();
		System.out.println("\n\t"+((val==-1)?"ISBN should be a 10 digit number":(val==0)?"Legal ISBN":"Illegal ISBN")+"\n\n");
	}
}