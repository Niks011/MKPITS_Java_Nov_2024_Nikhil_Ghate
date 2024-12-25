package calculator;

public class Subtraction{
	private double num1,num2;
	
	public Subtraction(double num1, double num2){
	this.num1=num1;
	this.num2=num2;
	}

	public void display(){
	double sub = num1 - num2;
	System.out.println("Subtraction is :"+sub);
	}
}
