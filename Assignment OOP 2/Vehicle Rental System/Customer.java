
class Customer{

	private String name, department, email;
	private int rollno, number; 
	
	public void setName(String name){
	this.name = name;
	}
	
	public void setDepartment(String dept){
	this.department = dept;
	}
	
	public void setEmail(String email){
	this.email= email;
	}
	public void setrollNumber(int num){
	this.rollno = num;
	}
	public void setNumber(int number){
	this.number= number;
	}


	public String getName(){
	return name;
	}
	public String getDepartment(){
	return department;
	}
	
	public String getEmail(){
	return email;
	}
	public int getrollNumber(){
	return rollno;
	}
	public int getNumber(){
	return number;
	}

}