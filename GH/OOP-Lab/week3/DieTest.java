import java.util.*;
import java.lang.Math;

class Die
{
	int Sideup;

	Die()
	{
		this.Sideup=1;
	}

	int getSideUp()
	{
		return this.Sideup;
	}

	void roll()
	{
		this.Sideup=1;
		double rand=Math.random()*100;
		this.Sideup=(int)(rand)%6+1;
	}
}

class DieTest
{
	public static void main(String[] args)
	{
		Die dice1=new Die();
		Die dice2=new Die();
		dice1.roll();
		dice2.roll();
		int dice1roll=dice1.getSideUp();
		int dice2roll=dice2.getSideUp();
		System.out.println("\n\n\t\tDice 1:"+dice1roll+"\n\t\tDice 2:"+dice2roll+"\n\t\tSum of Side ups of two die:"+(dice1roll+dice2roll)+"\n\n");
	}
}