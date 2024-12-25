package calculator;

public class Division{
	private double num1,num2;
	
	public Division(double num1, double num2){
	this.num1=num1;
	this.num2=num2;
	}

	public void display(){
	double div  = num1 / num2;
	System.out.println("Division is :"+ div);
	}
}
