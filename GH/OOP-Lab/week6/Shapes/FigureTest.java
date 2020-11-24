//
// FigureTest.java
// Abstract Class Figure: Rectangle, Square and Triangle
//

import java.util.*;

abstract class Figure 
{

	int dim1;
	int dim2;
	abstract double area(int dim1, int dim2);

	static void printStuff()
	{
		System.out.println("STATIC STUFF");
	}

}

class Rectangle extends Figure 
{

	double area(int dim1, int dim2) 
	{
		return dim1 * dim2;
	}

	static void printStuff () 
	{
		System.out.println("RECT STUFF");
	}

}

class Triangle extends Figure 
{

	double area(int dim1, int dim2) 
	{
		return 0.5 * dim1 * dim2;
	}

	static void printStuff () 
	{
		System.out.println("TRIANGLE STUFF");
	}

}

class Square extends Figure 
{

	double area(int dim1, int dim2) 
	{
		return dim1 * dim2;
	}

	static void printStuff () 
	{
		System.out.println("SQUARE STUFF");
	}

}

public class FigureTest 
{

	public static void main (String [] args) 
	{

		int dim1, dim2;

		Scanner sc = new Scanner(System.in);

		Figure rectangle = new Rectangle();
		Figure triangle = new Triangle();
		Figure square = new Square();

		Figure figure;

		System.out.print("\n\n\t\tEnter length of rectangle: ");
		dim1 = sc.nextInt();
		System.out.print("\n\n\t\tEnter length of rectangle: ");
		dim2 = sc.nextInt();
		System.out.println("Rectangle area = " + rectangle.area(dim1, dim2));
		Rectangle.printStuff();
		
		Figure.printStuff();

		figure = triangle;
		System.out.print("Enter the base of triangle: ");
		dim1 = sc.nextInt();
		System.out.print("Enter the height of triangle: ");
		dim2 = sc.nextInt();
		System.out.println("Triangle area = " + figure.area(dim1, dim2));
		Triangle.printStuff();

		figure = square;
		System.out.print("Enter the side of the square: ");
		dim1 = sc.nextInt();
		System.out.println("Rectangle area = " + figure.area(dim1, dim1));
	}
}
