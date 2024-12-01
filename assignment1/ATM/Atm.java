import java.util.Scanner;
class Machine
{
	void code()
	{
	int balence=1000;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to ATM");
	System.out.println("please Choose an option");
	System.out.println("1 : Check Account balence");
	System.out.println("2 : Deposit Money");
	System.out.println("3 : Withdraw Money");
	
	int choice = sc.nextInt();
	if(choice == 1){
	System.out.println("Your Current Balence is: " + balence);
	}

	else if(choice == 2){
	System.out.println("Enter Money you wnat to Deposit: ");
	int add = sc.nextInt();
	balence = balence + add;
	System.out.println("Your Updated Balence is: " + balence);
	}
	else if(choice == 3){
	System.out.println("Enter Money you want to Withdraw:");
	int withdraw = sc.nextInt();
	balence = balence-withdraw;
	System.out.println("Your Current Balence is: " + balence);
	}
	else{
	System.out.println("Invalid Choice");
	}

	}
}
class Atm
{
	public static void main(String args[])
	{
		Machine mc = new Machine();
		mc.code();
	}
}