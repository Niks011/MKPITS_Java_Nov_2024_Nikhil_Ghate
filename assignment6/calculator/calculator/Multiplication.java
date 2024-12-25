package calculator;

public class Multiplication{
	private double num1,num2;
	
	public Multiplication(double num1, double num2){
	this.num1=num1;
	this.num2=num2;
	}

	public void display(){
	double mul = num1 * num2;
	System.out.println("Multiplication is :"+ mul);
	}
}
