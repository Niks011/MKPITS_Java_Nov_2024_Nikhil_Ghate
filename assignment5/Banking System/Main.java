import java.util.Scanner;

abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
	abstract void balanceInquiry();
}

class SavingAccount extends BankAccount{
	int balence = 5000;
	int amount;
	SavingAccount(int a){
	this.amount = a;
	}

	void deposit(){
		balence += amount;
		System.out.println("Deposit successfully");
		System.out.println("New balence = "+balence);
	}
	void withdraw(){
		balence -= amount;
		System.out.println("Withdrawl successfully");
		System.out.println("New balence = "+balence);
	}
	void balanceInquiry(){
		System.out.println("Your Available Balence = "+balence);
	}
}

class CurrentAccount extends BankAccount{
	int balence = 5000;
	int amount;
	CurrentAccount(int a){
	this.amount = a;
	}
	
	void deposit(){
		balence += amount;
		System.out.println("Deposit successfully");
		System.out.println("New Current balence = "+balence);
	}
	void withdraw(){
		balence -= amount;
		System.out.println("Withdrawl successfully");
		System.out.println("New Current balence = "+balence);
	}
	void balanceInquiry(){
		System.out.println("Your Available Balence = "+balence);
	}
}

class Main{
	public static void main(String args[]){
	System.out.println("Choose Account");
	System.out.println("1: Savinng Account");
	System.out.println("2: Current Account");
	Scanner sc = new Scanner(System.in);
	int num =  sc.nextInt();
	BankAccount b;
	int amount=0;

	
	if(num == 1){
		System.out.println("Choose One Option");
		System.out.println("1: Balence Inquiry");
		System.out.println("2: Deposit Amount");
		System.out.println("3: Withdraw Ammount");
		int number = sc.nextInt();
	
		switch(number){
			
		case 1:  b = new SavingAccount(amount);
			b.balanceInquiry();
			break;
		case 2: System.out.println("Enter the Amount");
			amount =sc.nextInt();
			b = new SavingAccount(amount);
			b.deposit();
			break;
		case 3:  System.out.println("Enter the Amount");
			amount =sc.nextInt();
			b = new SavingAccount(amount);
			b.withdraw();
			break;
		default: System.out.println("Invalid Number");
			}

	}else if(num == 2){
		System.out.println("Choose One Option");
		System.out.println("1: Balence Inquiry");
		System.out.println("2: Deposit Amount");
		System.out.println("3: Withdraw Ammount");
		int number = sc.nextInt();
	
		switch(number){
		case 1:  b = new CurrentAccount(amount);
			b.balanceInquiry();
			break;
		case 2: System.out.println("Enter the Amount");
			amount =sc.nextInt();
			b = new CurrentAccount(amount);
			b.deposit();
			break;
		case 3:  System.out.println("Enter the Amount");
			amount =sc.nextInt();
			b = new CurrentAccount(amount);
			b.withdraw();
			break;
		default: System.out.println("Invalid Number");
			}
	}else{
		System.out.println("Invalid Number");
		}

	}
}
