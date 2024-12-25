import calculator.Addition;
import calculator.Subtraction;
import calculator.Multiplication;
import calculator.Division;

public class Main{
	public static void main(String args[]){
	Addition add = new Addition(5, 6);
        System.out.println("Addition: " + add.display());
	Subtraction sb = new Subtraction(12,6);
	sb.display();
	Multiplication mul = new Multiplication(4,6);
	mul.display();
	Division div = new Division(6,35);
	div.display();
	}

}