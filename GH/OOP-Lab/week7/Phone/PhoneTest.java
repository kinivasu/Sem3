import java.io.*;
import java.util.Scanner;

class Phone
{
	String brand;
	int memCapacity;
	interface Callable
	{
		void makeAudioCall(String cellNum);
		void makeVideoCall(String cellNum);
	}
}

class BasicPhone extends Phone implements Phone.Callable
{
	public void makeAudioCall(String cellNum)
	{
		System.out.println("Dialling "+cellNum+"...");
	}
	public void makeVideoCall(String cellNum)
	{
		System.out.println("Video Calling Not Available.");
	}
	BasicPhone(String b, int m)
	{
		brand=b;
		memCapacity=m;
	}
}

class SmartPhone extends Phone implements Phone.Callable
{
	public void makeAudioCall(String cellNum)
	{
		System.out.println("Calling "+cellNum+"...");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println("Video Calling "+cellNum+"...");
	}

	SmartPhone(String b, int m)
	{
		brand=b;
		memCapacity=m;
	}
}

class PhoneTest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic phone brand and memory capacity: ");
		BasicPhone bp= new BasicPhone(sc.next(),sc.nextInt());
		System.out.println("Enter smart phone brand and memory capacity: ");
		SmartPhone sp= new SmartPhone(sc.next(),sc.nextInt());
		System.out.println("Enter number to call:");
		String num=sc.next();
		bp.makeAudioCall(num);
		bp.makeVideoCall(num);
		sp.makeAudioCall(num);
		sp.makeVideoCall(num);
	}
}
