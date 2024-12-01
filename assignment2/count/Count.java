import java.util.Scanner;
class Abc
{
	int count=0;

	void matter()
	{
	System.out.println("Enter the Number");
	Scanner sc =new Scanner(System.in);
	int num = sc.nextInt();
	
	for(; num!=0; num/=10, ++count){
	}
	System.out.println("Count of your number is "+ count);

	}

}

class Count{
	public static void main(String args[]){
	Abc ab = new Abc();
	ab.matter();
}
}