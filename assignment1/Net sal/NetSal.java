import java.util.Scanner;
class NetSalary
{
	double bs, allowance;
	double deduct = 6000;
	
	void count(){
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the Basic Salary");
	bs=sc.nextDouble();
	System.out.println("Enter the Allowance");
	allowance=sc.nextDouble();
	}

	void netsalary()
	{
	double NetSalary = bs + allowance - deduct;
	System.out.println("Net Salary is " + NetSalary);
	} 
}

class NetSal{
	public static void main(String args[])
	{
	NetSalary nt = new NetSalary();
	nt.count();
	nt.netsalary();
	}
}

	