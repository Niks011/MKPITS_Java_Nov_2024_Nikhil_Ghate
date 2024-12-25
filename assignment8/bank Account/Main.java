import java.util.Scanner;

class Bank{
	double balance=5000;

	void withdraw(double amount) throws InsufficientFundsException{
	if(amount > balance){
	throw new InsufficientFundsException();
	}else{
	balance =  balance - amount;
	System.out.println("Withdraw Successfull");
	System.out.println("Current Balance " + +balance);
	}
	}

}

class Main{
	public static void main(String args[]){
	System.out.println("Enter the Amount wnat to withdraw");
	Scanner sc = new Scanner(System.in);
	double amount= sc.nextDouble();
	Bank bk = new Bank();
	try{
	bk.withdraw(amount);
	}catch(Exception e){
	System.out.println(e.getMessage());
	}
	}

}