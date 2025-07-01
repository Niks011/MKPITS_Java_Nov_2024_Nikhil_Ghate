import java.util.Scanner;

abstract class Shape
{
	abstract void area();
}


class Rect extends Shape{
	int length , breath;
	
	Rect(int l, int b){
	this.length= l;
	this.breath= b;
	}

	void area()
	{
	double area = length * breath;
	System.out.println("Area of rectangle is "+ area);
	}
}

class Circle extends Shape{
	double r, pi=3.14;
	double area;
	
	Circle(double r){
	this.r= r;	
	}
	
	void area()
	{
	area = pi*r*r;
	System.out.println("Area of Circle is "+ area);
	}
}


class Main{

	public static void main(String args[]){
	System.out.println("Enter the number");
	System.out.println("1: To Calculate Area of Rectangle");
	System.out.println("2: To Calculate Area of Circle");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Shape s;
	switch(num){
		case 1: System.out.println("Enter the Length and Breath");
			int l = sc.nextInt();
			int b = sc.nextInt();
			s = new Rect(l,b);
			s.area();
			break;

		case 2: System.out.println("Enter the Radius");
			int r = sc.nextInt();
			s = new Circle(r);
			s.area();
			break;

		default : System.out.println("invalid number");

		}
	}
}