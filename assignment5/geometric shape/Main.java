import java.util.Scanner;

abstract class Shape{
	abstract void volume();
}

class Sphere extends Shape{
	double radius;
 	Sphere(double r){
	this.radius = r;
	}
	
	void volume()
	{
	double volume = (4/3)*3.14*radius*radius*radius;
	System.out.println("volume of Sphere is " + volume);
	}
}

class Cube extends Shape{
	double sideLength;
	Cube(double s){
	this.sideLength = s;
	}

	void volume(){
	double volume = 6*sideLength;
	System.out.println("volume of Cube is "+ volume);
	}
}

class Cylinder extends Shape{
	int radius, height;
	Cylinder(int r, int h){
	this.radius=r;
	this.height = h;
	}

	void volume(){
	double volume = 3.14*radius*radius*height;
	System.out.println("volume of Cylinder is " + volume);
	}
}

class Main{
	public static void main(String args[]){
	System.out.println("Enter the number");
	System.out.println("1: To Calculate volume of Sphere");
	System.out.println("2: To Calculate volume of Cube");
	System.out.println("3: To Calculate volume of Cylinder");
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	Shape s;
	switch(num){
	case 1: System.out.println("Enter the Radius");
		int r = sc.nextInt();
		s = new Sphere(r);
		s.volume();
		break;
	case 2: System.out.println("Enter Side length");
		double sl= sc.nextInt();
		s = new Cube(sl);
		s.volume();
		break;

	case 3: System.out.println("Enter the Radius and Height");
		int rad= sc.nextInt();
		int h = sc.nextInt();
		s = new Cylinder(rad, h);
		s.volume();
		break;
		
	default : System.out.println("Invalid number");		
	}
	
	}
}