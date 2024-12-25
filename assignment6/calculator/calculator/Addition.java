package calculator;

public class Addition{
	private double num1,num2;
	
	public Addition(double num1, double num2){
	this.num1=num1;
	this.num2=num2;
	}

	public double display(){
	double sum = num1 + num2;
	//System.out.println("Additon is :"+sum);
	return sum;
	}
}
