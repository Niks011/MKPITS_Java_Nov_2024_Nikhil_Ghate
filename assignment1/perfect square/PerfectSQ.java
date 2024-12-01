import java.util.Scanner;

class Square
{
	void find()
	{
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int numb = sc.nextInt();

	for(int i=0; i<=numb; i++){
	if(i*i == numb)
	{
	System.out.println(numb + " is perfect Square");
	}
	}
	}
}

class PerfectSQ
{
	public static void main(String args[])
	{
	Square sq= new Square();
	sq.find();
	}
}