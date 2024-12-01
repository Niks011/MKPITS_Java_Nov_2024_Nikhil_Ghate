import java.util.Scanner;

class Calculator{
	int out;
	private int num1;
	private int num2;

	Calculator(int num1, int num2){
	this.num1=num1;
	this.num2=num2;
	}
	
	void code(int choice){
	switch(choice)
	{
	case 1: out = num1 - num2;
		System.out.println(num1+"-"+ num2 +" = "+out);
		break;
	case 2: out= num1 + num2;
		System.out.println(num1+"+"+ num2 +" = "+out);
		break;
		
	case 3: out = num1 / num2;
		System.out.println(num1+"/"+ num2 +" = "+out);
		break;

	case 4: out = num1 * num2;
		System.out.println(num1+"*"+ num2 +" = "+out);
		break;

	default : System.out.println("Invalid option");		
	
	}
	
}

	void options(){
	System.out.println("1: Subtraction");
	System.out.println("2: Addition");
	System.out.println("3: Division");
	System.out.println("4: Multiplication");
	}

}

class Main{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Numbers");
	int num1= sc.nextInt();
	int num2 = sc.nextInt();
	System.out.println("Choose an Option");
	Calculator cal = new Calculator(num1, num2);
	cal.options();
	int c = sc.nextInt();
	cal.code(c);
	
	}
	
}