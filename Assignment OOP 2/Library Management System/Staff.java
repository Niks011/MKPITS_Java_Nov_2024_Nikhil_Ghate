class Staff{
	private String name, deptName, email;
	private int id, mobNumber; 
	
	public void setName(String name){
	this.name = name;
	}
	
	public void setDepartment(String dept){
	this.deptName = dept;
	}
	
	public void setEmail(String email){
	this.email= email;
	}
	public void setId(int num){
	this.id = num;
	}
	public void setNumber(int number){
	this.mobNumber = number;
	}


	public String getName(){
	return name;
	}
	public String getDepartment(){
	return deptName;
	}
	public String getEmail(){
	return email;
	}
	public int getId(){
	return id;
	}
	public int getNumber(){
	return mobNumber;
	}
	
}
	