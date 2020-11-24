import java.util.*;
class Complex
{
	int real;
	int complex;
	char id;
	Complex(int a,int b,char c)
	{
		real=a;
		complex=b;
		id=c;
	}
	void display()
	{
		System.out.println((complex>=0)?real+"+"+complex+"i":real+""+complex+"i");
	}
	Complex add(Complex ob,char n)
	{
		Complex ob2=new Complex(0,0,n);
		ob2.real=ob.real+real;
		ob2.complex=ob.complex+complex;
		System.out.println((ob2.complex>=0)?ob2.real+"+"+ob2.complex+"i":ob2.real+""+ob2.complex+"i");
		return ob2;
	}

	Complex sub(Complex ob,char n)
	{
		Complex ob2=new Complex(0,0,n);
		ob2.real=ob.real-real;
		ob2.complex=ob.complex-complex;
		System.out.println((ob2.complex>=0)?ob2.real+"+"+ob2.complex+"i":ob2.real+""+ob2.complex+"i");
		return ob2;
	}
}

class ComplexTest
{
	public static void main(String[]  args)
	{
		Complex ob=new Complex(1,1,'1');
		Complex ob2=new Complex(2,3,'2');
		Complex ob3=ob.add(ob2,'3');
		ob3.display();
		ob3=ob.sub(ob3,'3');
		ob3.display();
	}
}