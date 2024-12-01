import java.util.Scanner;
class Disc
{
	void check()
	{
	System.out.println("Enter the amount");
	Scanner sc=new Scanner(System.in);
	double amount = sc.nextDouble();
	
	if(amount>=500){
	System.out.println("Customer is eligible to 10% Discount");
	}
	else{
	System.out.println("Customer is not eligible for any discount");
	}
	}	
}

class Discount
{
	public static void main(String args[])
	{	
	Disc dc = new Disc();
	dc.check();
	}

}