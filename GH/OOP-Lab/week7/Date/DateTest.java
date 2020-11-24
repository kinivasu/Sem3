import java.io.*;
import java.util.Scanner;

class CurrentDate
{
	int day,month,year;
	void CreateDate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date(dd/mm/yyyy):");
		int d,m,y;
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		int c=1;
		try
		{
			if(month<1||month>12)
			{
				throw new InvalidMonthException("Month should be between 1 and 12");
			}
			else if(day<1||day>31)
				throw new InvalidDayException("Day should be in range 1-31");
			if(month==2)
				{
					if(year%100==0)
					{
						if(year%400==0)
						{
							if(day>29)
					throw new InvalidDayException("Day should be in range 1-29");
						}
						else
						{
							if(day>28)
					throw new InvalidDayException("Day should be in range 1-28");
						}
					}
					else
					{
						if(year%4==0)
						{
							if(day>29)
					throw new InvalidDayException("Day should be in range 1-29");
						}
						else
						{
							if(day>28)
					throw new InvalidDayException("Day should be in range 1-28");
						}
					}
				}
			else if(month==4||month==6||month==9||month==11)
			{
				if(day>30)
				throw new InvalidDayException("Day should be in range 1-30");
			}
			else
			{
				if(day>31)
				throw new InvalidDayException("Day should be in range 1-31");
			}
		}
		catch(InvalidDayException ex)
		{
			c=0;
			System.out.println(ex);
		}
		catch(InvalidMonthException ex)
		{
			c=0;
			System.out.println(ex);
		}
		if(c==1)
			System.out.println("Current Date: "+day+"/"+month+"/"+year);
	}
}

class InvalidDayException extends Exception
{
	String err;
	public InvalidDayException(String s)
	{
		err=s;
	}

	public String toString()
	{
		return("Day is invalid. "+err);
	}
}

class InvalidMonthException extends Exception
{
	String err;
	public InvalidMonthException(String s)
	{
		err=s;
	}
	public String toString()
	{
		return("Month is invalid. "+err);
	}
}

class DateTest
{
	public static void main(String[] args) 
	{
		CurrentDate c=new CurrentDate();
		c.CreateDate();
	}
}