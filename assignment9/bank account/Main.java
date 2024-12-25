 class BankAccount{
	static double balance = 5000;
	
	public static synchronized void deposit(double amount) {
      System.out.println("Depositing " + amount + " into the account.");
      balance += amount;
      System.out.println("New balance after deposit: " + balance);
    }

	public static synchronized void withdraw(double amount) {
      if (amount > balance) {
     System.out.println("Insufficient funds to withdraw..");
      } else {
      balance -= amount;
	System.out.println("Withdrawal Successfull "+ amount);
      System.out.println("New balance after withdrawal: " + balance);
        }
    }

	public static double getBalance() {
        return balance;
    }
}



class Thread1 extends Thread {

    public void run() {
	for(int i=0; i<10;i++){
	BankAccount.deposit(500);
	}
      }
}

class Thread2 extends Thread {

    public void run() {
	while(BankAccount.getBalance()>0){
	try{
      BankAccount.withdraw(500);
	}catch(Exception e){
	System.out.println(e.getMessage());
	return;
	}
	}
    }
}

class Main {
	public static void main(String args[]) {
      BankAccount account = new BankAccount();
	Thread1 t1 = new Thread1();
      Thread2 t2 = new Thread2();
	t1.start();
      t2.start();
	try{
	t1.join();
      t2.join();
      } catch(Exception e) {
      System.out.println(e);
      }
	System.out.println("Final Ammount is "+BankAccount.getBalance());
	}
}