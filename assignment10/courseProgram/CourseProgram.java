import java.util.Scanner;

class Course{
	private int courseId;
	private String courseAdmin;
	private String courseName;
	private int quiz ;
	private int handson;

	public Course(int courseId, String courseAdmin, String courseName, int quiz, int handson){
	this.courseId = courseId;
	this.courseAdmin = courseAdmin;
	this.courseName = courseName;
	this.quiz = quiz;
	this.handson = handson;
	}
	public int getCourseId(){
	return courseId;
	}
	public String getCourseAdmin(){
	return courseAdmin;
	}
	public String getCourseName(){
	return courseName;
	}
	public int getQuiz(){
	return quiz;
	}
	public int getHandson(){
	return handson;
	}

}

class CourseProgram{
	public static int findAvgOfQuizByAdmin(Course[] course, String name){
	int totalquiz = 0;
	int count = 0;
	for(int i=0; i<course.length; i++){
	if(course[i].getCourseAdmin().equalsIgnoreCase(name)){
	totalquiz += course[i].getQuiz();
	count++;
	}
	}
	if(count>0){
	return totalquiz/count;
	}else{
	return 0;
	}
	}
	
	public static void main(String args[]){
	System.out.println("Enter the number of Entries");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Course course[] = new Course[num];
	for(int i=0; i<num; i++){
	System.out.print("Enter course ID: ");
	int courseId = sc.nextInt();
	
	System.out.print("Course Name: ");
	String courseName = sc.next();

	System.out.print("Admin Name: ");
	String adminName = sc.next();

	System.out.print("Course Quiz: ");
	int quiz = sc.nextInt();

	System.out.print("Handson: ");
	int handson = sc.nextInt();
	System.out.println();

	course[i] = new Course(courseId, adminName, courseName, quiz, handson);
	}

	System.out.print("Enter the Admin Name: ");
	String name =sc.next();
	int quizAvg = findAvgOfQuizByAdmin(course, name);

	if(quizAvg!=0){
	System.out.println("Average Quiz for "+name+ " is "+quizAvg);
	}else{
	System.out.println("Course not Found");
	}
	}
}



