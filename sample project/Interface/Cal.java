import java.util.Scanner;

interface Calculation
{
	int calculate(int num1, int num2);
}


class Addition implements Calculation{

	public int calculate(int num1, int num2)
	{
	int ans = num1 + num2;
	return ans;
	}
}

class Substraction implements Calculation{

	public int calculate(int num1, int num2)
	{
	int ans = num1 - num2;
	return ans;
	}
}

class Division implements Calculation{

	public int calculate(int num1, int num2)
	{
	int ans = num1 / num2;
	return ans;
	}
}

class Multiplication implements Calculation{

	public int calculate(int num1, int num2)
	{
	int ans = num1 * num2;
	return ans;
	}
}


class Cal{

	public static void main(String args[]){
	System.out.println("Enter two numbers");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("1: To calculate Sum");
	System.out.println("2: To calculate Substraction");
	System.out.println("3: To calculate Division");
	System.out.println("4: To calculate Multiplication");
	int num = sc.nextInt();
	Calculation c;
	int n;
	switch(num){
		case 1:
			c = new Addition();
			n = c.calculate(num1 , num2);
			System.out.println("Addition is " + n);

			break;

		case 2:
			c = new Substraction();
			n = c.calculate(num1 , num2);
			System.out.println("Substraction is "+ n);

			break;
		case 3:
			c = new Division();
			n = c.calculate(num1 , num2);
			System.out.println("Division is "+ n);

			break;
		case 4:
			c = new Multiplication();
			n = c.calculate(num1 , num2);
			System.out.println("Multiplication is "+ n);

			break;
		default : System.out.println("invalid number");

		}
	}
}