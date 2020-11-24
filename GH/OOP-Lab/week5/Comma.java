import java.util.*;
class Comma
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String str = "";
		int ctr = 1;

		for(int i = s.length()-1; i>=0 ;i--)
		{
			if(ctr%3==0)
			{
				if(i>1)
				{
					str = "," + s.charAt(i) + str;
				}
				else
				{
					str = "" + s.charAt(i) +str;
				}
			}
			else
			{
				str = "" + s.charAt(i) +str;
			}
			ctr++;		}

		System.out.println(str);
	}
}