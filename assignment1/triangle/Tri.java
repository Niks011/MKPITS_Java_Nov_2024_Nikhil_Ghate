import java.util.Scanner;
class Tri
{
	void angle()
{
	int x,y,z;
	System.out.print("Enter the values");
	Scanner sc = new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	z=sc.nextInt();
	
	if(x==y && y==z){
	System.out.println("triangle is equilateral");
	}

	else if(x==y || y==z || x==z){
	System.out.println("Triangle is isoscele"); 
	}

	else{
	System.out.println("Scalene Triangle");
	}
}
}


