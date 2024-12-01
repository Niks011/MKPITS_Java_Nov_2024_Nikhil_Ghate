abstract class Employee{
	abstract void  calculate();
	abstract void information(String name, int age, int id);
}

class HourlyEmployee extends Employee{
	int hr = 150;
	int days = 20 ;
	
	public void calculate(){
	int sal = (hr*9)*days;
	System.out.println("Salary of the Hourly base employee is: "+ sal);

	}
	public void information(String name, int age, int id){

	System.out.println("Name = "+ name);
	System.out.println("Date of Age = "+ age);
	System.out.println("Employee Id = "+ id);
	System.out.println();

	}
}

class SalariedEmployee extends Employee{
	int base = 30000;
	int pf= 2000;
	int other = 3000;
	
	public void calculate(){
	base = base +other+pf;
	System.out.println("Salary of the employee is: "+ base);

	}
	public void information(String name, int age, int id){

	System.out.println("Name = "+ name);
	System.out.println("Date of Age = "+ age);
	System.out.println("Employee Id = "+ id);
	}

}

class Main{
	public static void main(String args[]){
	Employee e = new HourlyEmployee();
	e.calculate();
	e.information("Nikhil Ghate",23, 20115);
	Employee e1 = new SalariedEmployee();
	e1.calculate();
	e1.information("Shubham Raina", 27, 21420);

	}
}