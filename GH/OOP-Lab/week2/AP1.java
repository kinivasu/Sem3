import java.util.*;
class AP1
{
	public static void prime(int primear[])
	{
		int k=1;
		primear[0]=2;
		for(int i=3;k<100;i++)
		{
			int flag=1;
			for(int j=2;j<=i/2;j++)
				if(i%j==0)
				{
					flag=0;
				}
			if(flag==1)
			{
				primear[k]=i;
				k++;
			}
		}
	}
	public static void main(String[] args)
	{
		int n=100;
		int[] primear=new int[n];
		prime(primear);
		for (int i=0;i<100;i++)
		{
			System.out.println((i+1)+"|"+primear[i]+"\n");
		}
	}
}