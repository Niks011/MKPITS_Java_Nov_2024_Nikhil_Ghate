import java.util.Scanner;
class Eligibility
{
	void check()
	{
	System.out.println("Enter the Entrance Exam Score");
	Scanner sc=new Scanner(System.in);
	int entrance = sc.nextInt();
	System.out.println("Enter the Overall Academic Score");
	int acd = sc.nextInt();	

	if(entrance>=80 && acd >= 60){
	System.out.println("Student is Eligible for Admission in University");
	}
	else{
	System.out.println("Sorry..! Student is Not Eligible for Admission in University");
	}
}
}

class Student
{
	public static void main(String args[])
	{	
	Eligibility eg = new Eligibility();
	eg.check();
	}

}