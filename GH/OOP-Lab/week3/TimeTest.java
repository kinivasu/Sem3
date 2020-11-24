import java.util.*;

class Time
{
	int hh;
	int mm;
	int ss;
	Time(int h,int m,int s)
	{
		hh=h;
		mm=m;
		ss=s;
	}
	void twentyfour()
	{
		System.out.println("\n\n\n\n\n"+(hh)+":"+mm+":"+ss);
	}
	Time add(Time ob)
	{
		Time ob2=new Time(hh,mm,ss);
		ob2.ss=ob2.ss+ob.ss;
		if(ob2.ss>=60){ob2.mm+=(ob2.ss/60);ob2.ss%=60;}
		ob2.mm=ob2.mm+ob.mm;
		if(ob2.mm>=60){ob2.hh+=(ob2.mm/60);ob2.mm%=60;}
		ob2.hh=ob2.hh+ob.hh;
		if(ob2.hh>=24){ob2.hh%=24;}
		return ob2;
	}

	Time sub(Time ob)
	{
		Time ob2=new Time(hh,mm,ss);
		ob2.ss=ob2.ss-ob.ss;
		if(ob2.ss<0){ob2.mm+=((ob2.ss-60)/60);ob2.ss=60-((-ob2.ss)%60);}
		ob2.mm=ob2.mm-ob.mm;
		if(ob2.mm<0){ob2.hh+=((ob2.mm-60)/60);ob2.mm=60-((-ob2.mm)%60);}
		ob2.hh=ob2.hh-ob.hh;
		if(ob2.hh<0){ob2.hh=24-((-ob2.hh)%24);}
		return ob2;
	}

	void compare(Time ob)
	{
		Time ob2=new Time(hh,mm,ss);
		int hr=(ob2.hh-ob.hh)*60*60;
		int mr=(ob2.mm-ob.mm)*60;
		int sr=(ob2.ss-ob.ss);
		int r=hr+mr+sr;
		if(r>0)
		{
			System.out.println("\n\nTime2 Greater than Time1");
		}
		else if(r<0)
		{

			System.out.println("\n\nTime2 Lesser than Time1");
		}
		else
		{
			System.out.println("\n\nSAME TIME RA!!");
		}
	}
}

class TimeTest
{
	public static void main(String[] args)
	{
		Time ob=new Time(12,12,12);
		Time ob2= new Time(13,13,13);
		Time ob3=ob.add(ob2);
		System.out.println("ADD:");
		ob3.twentyfour();
		ob3=ob.sub(ob2);
		System.out.println("SUB:");
		ob3.twentyfour();
		ob2.compare(ob3);
	}
}