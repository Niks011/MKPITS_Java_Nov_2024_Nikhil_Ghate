import java.util.Scanner;

class Calculator
{
	double area;
	int length, breath, base, hight, radius, side;
	void display(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose The Option for Calculate");
	System.out.println("1 : Area of Rectangle");
	System.out.println("2 : Area of Triangle");
	System.out.println("3 : Area of Circle");
	System.out.println("4 : Area of Square");
	int choice = sc.nextInt();
	if(choice == 1){
		System.out.println("Enter the Length and Breath");
		length = sc.nextInt();
		breath = sc.nextInt();
		rect();
		}
		if(choice == 2){
		System.out.println("Enter the Base and Hight");
		base = sc.nextInt();
		hight = sc.nextInt();
		triangle();
		}
		if(choice == 3){
		System.out.println("Enter the Radius");
		radius= sc.nextInt();
		circle();
		}
		if(choice == 4){
		System.out.println("Enter the Size");
		side = sc.nextInt();
		square();
		}
	}
	void rect(){	
	area = length * breath;
	System.out.println("Area of Rectangle is "+ area);
	}
	
	void triangle(){
	area = 0.5 * base * hight;
	System.out.println("Area of Triangle is "+ area);
	}
	
	void circle(){
	area = 3.14* radius*radius;
	System.out.println("Area of Circle is "+ area);
	}

	void square(){
	area = side*side;
	System.out.println("Area of Square is "+ area);
	}

	void logic(int choice){
	
	}
}

class Area{
	public static void main(String args[]){
	Calculator cl = new Calculator();
	cl.display();
	}

}