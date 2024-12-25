import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String Name;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
		System.out.println();
		System.out.println("Updated Balance is "+ balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + Name);
        System.out.println("Balance: " + balance);
	  System.out.println("If you want to Add Money.. press 1");
	  System.out.println("press Any number if you want to Exit");
	  Scanner sc= new Scanner(System.in);
	  int n = sc.nextInt();
	  if(n == 1){
	  System.out.println("how much money you want to deposit");
	  double amount = sc.nextInt();
	  deposit(amount);
		}
    }
}


