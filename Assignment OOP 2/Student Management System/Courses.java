
class Courses{

	private String courseName, institute ;
	private int price,courseNumber; 
	
	public void setCourseName(String name){
	this.courseName = name;
	}
	
	public void setInstitute(String inst){
	this.institute = inst;
	}
	
	public void setPrice(int price){
	this.price = price;
	}
	public void setCourseNumber(int number){
	this.courseNumber = number;
	}


	public String getCourseName(){
	return courseName;
	}
	public String getInstitute){
	return institude;
	}
	public int getPrice(){
	return price;
	}
	public int getCourseNumber(){
	return courseNumber;
	}

}