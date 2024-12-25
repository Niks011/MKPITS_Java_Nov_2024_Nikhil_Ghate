package acc;
public class Account{
	private double balance;

	public Account(double bal){
	this.balance =  bal;
	}
	
	public void display(){
	System.out.println("Account balance is :"+balance);
	}
}
