
class Patrons{

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
	// public String getbookName(){
	// return bookName;
	// }
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

class Mainn {
	public static void main(String args[]){
	//Books bs = new Books();

	Patrons pt = new Patrons();
	pt.setName("Nikhil");
	pt.setDepartment("Information Technology");
	pt.setEmail("nikhilghate@gmail.com");
	pt.setrollNumber(205);
	pt.setNumber(915419845);
	System.out.println(pt.getName());
	System.out.println(pt.getDepartment());
	//System.out.println(pt.getbookName());
	System.out.println(pt.getEmail());
	System.out.println(pt.getrollNumber());
	System.out.println(pt.getNumber());


	//Staff st = new Staff();
	
	}


}