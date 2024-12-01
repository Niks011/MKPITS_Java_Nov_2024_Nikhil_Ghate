import java.util.Scanner;
class Fibo{
	int num1=0, num2=1, num, n;
	
	void code(){
	System.out.println("Enter the number");
	Scanner sc =  new Scanner(System.in);
	n = sc.nextInt();
	System.out.println(num1);
	System.out.println(num2);
	n = n-2;

	do{
	num = num1 + num2;
	num1 = num2;
	num2 = num;
	System.out.println(num);
	n--;
	}while(n>0);
	//System.out.println("Fibonacci Series is " + num);
	}
	
}

class Fibonacci{
	public static void main(String args[]){
	Fibo fb = new Fibo();
	fb.code();
}
}