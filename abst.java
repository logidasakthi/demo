import java.util.Scanner;
abstract class Shape
{
	static int l;
	static int b;
	static int h;
	static int r;
	static int a;
	abstract void area();	
}

class Rect extends Shape
{
	 void area()
	 {
		int area;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the len value");
		l=s.nextInt();
		System.out.println("enter the breadth value");
		b=s.nextInt();
		area=l*b;
		System.out.println("the area is:"+area);
	}
}
class Circle extends Shape
{
	 void area()
	 {
		double area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius value");
		r=s.nextInt();
		area=2*3.14*r*r;
		System.out.println("the area is:"+area);
	}
}

class Triangle extends Shape
{
	public void area()
	{
		double area;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the breadth value");
		b=s.nextInt();
		System.out.println("enter the height value");
		h=s.nextInt();
		area=0.5*b*h;
		System.out.println("the area is:"+area);
	}
}

class Square extends Shape
{
	public void area()
	{
		int area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a value");
		a=s.nextInt();
		area=a*a;
		System.out.println("the area is:"+area);
	}
}	
class abst
{
	public static void main(String []args)
	{
		System.out.println("rectangle");
		Rect a=new Rect();
		a.area();
		System.out.println("circle");
		Circle b=new Circle();
		b.area();
		System.out.println("triangle");
		Triangle c=new Triangle();
		c.area();
		System.out.println("square");
		Square d=new Square();
		d.area();
	}
}



