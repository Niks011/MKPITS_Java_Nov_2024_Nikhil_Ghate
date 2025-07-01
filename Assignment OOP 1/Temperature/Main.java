import java.util.Scanner;

class Temperature{
	private float cel;
	private float Far;

	Temperature(int cel){
	this.cel = cel;
	}

	void display()
	{
	double far = (cel * 1.8)+32;
	System.out.println("Value of " + cel + "  Celsius is: "+ far);
	}
	
}

class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Temperature in Celsius");
	int temp = sc.nextInt();
	Temperature t= new Temperature(temp);
	t.display();
	}

}