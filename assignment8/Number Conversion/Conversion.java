import java.util.Scanner;

class Conversion{
	public static void main(String args[]){
	Scanner sc =  new Scanner(System.in);
	int number=0, num2=1;
	
	while(num2 != 0){
	System.out.println("Enter the Strinng you want to convert");
	String input = sc.nextLine();
	
	try{
	number = Integer.parseInt(input);
	num2 = 0;
	}catch(Exception e){
	System.out.println("Invalid Input.. Please Enter valid number");
	}
	}
	System.out.println("Conversion successfull");
	System.out.println("Your Enter number is "+number);
	}

}