import java.io.*;
import java.util.Arrays;

class Employee{
	String name;
	int id;
	double salary;

	Employee(String name, int id, double salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
	}

	public String toString(){
	return "Name: "+name+", id: "+id+", Salary: "+salary;
	}
}

public class Main{
	public static void main(String args[]){
	try{
	BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
	String line = br.readLine();
	Employee[] employee = new Employee[0];
	
	while(line!=null){
	String[] record = line.split(",");
	Employee employees =  new Employee(record[0], Integer.parseInt(record[1]),Double.parseDouble(record[2]));
	employee = Arrays.copyOf(employee, employee.length+1);
	employee[employee.length-1]=employees;
	line = br.readLine();
	}
	for(Employee emp:employee){
	System.out.println(emp);
	}
	}catch(Exception e){
	System.out.println(e);
	}
	}
}