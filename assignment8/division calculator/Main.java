import java.util.Scanner;
class Division{
	
	void display(){
	System.out.println("Enter two numbers");
	Scanner sc =  new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	try
	{
	System.out.println("Answer is "+num1/num2);
	}catch(Exception e){
	System.out.println("Divide by 0 is not possible");
	}

	}
}

class Main{
	public static void main(String args[]){
		Division d = new Division();
		d.display();
	}
}