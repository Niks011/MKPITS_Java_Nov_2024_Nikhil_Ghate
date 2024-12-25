import java.io.*;
import java.util.Arrays;

class Student{
	private int rollno;
	private String name;
	private String branch;
	private double score;
	private boolean dayScholar;

	Student(int rollno, String name, String branch, double score, boolean dayScholar){
	this.rollno=rollno;
	this.name=name;
	this.branch = branch;
	this.score = score;
	this.dayScholar = dayScholar;
	}
	
	public int getRollno(){
	return rollno;
	}
	public String getName(){
	return name;
	}
	public String getBranch(){
	return branch;
	}
	public double getScore(){
	return score;
	}
	public boolean getDayScholar(){
	return dayScholar;
	}

	public String toString(){
	return "RollNO = "+rollno+ "  Name = "+name+ "  Score = "+score;
	}
}	

class Solution{
	public static int findCountOfDayscholarStudents(Student[] student){
	int count=0;
	for(int i=0; i<student.length; i++){
	if(student[i].getDayScholar() && student[i].getScore()>80){
	count++;
	}
	}
	return count;
	}
	
	public static Student findStudentwithSecondHighestScore(Student[] student){
	double highest=student[0].getScore();
	
	for(int i=1; i<student.length; i++){
	if(student[i].getDayScholar() == false){
	if(student[i].getScore()>highest){
	highest = student[i].getScore();
	}
	}
	}
	Student secondHighestScore = student[0];
	double secondHighest = student[0].getScore();
	for(int i=1; i<student.length; i++){
	if(student[i].getScore()>secondHighest && student[i].getScore()<highest){
	secondHighest = student[i].getScore();
	secondHighestScore = student[i];
	}
	}
	return secondHighestScore;
	}


	public static void main(String args[]){
	Student student[] = new Student[0];
	try{
	BufferedReader br = new BufferedReader(new FileReader("data.txt"));
	String line = br.readLine();	
	
	while(line!=null){
	String[] str = line.split(",");
	Student stud = new Student(Integer.parseInt(str[0]), str[1], str[2], Double.parseDouble(str[3]), Boolean.parseBoolean(str[4]));
	student = Arrays.copyOf(student, student.length+1);
	student[student.length-1] = stud;
	line= br.readLine();
	}
	}catch(Exception e){
	System.out.println(e);
	}

	int countScore = findCountOfDayscholarStudents(student);
	Student secondHighest = findStudentwithSecondHighestScore(student);
	if(countScore!=0){
	System.out.println("Count of Students are = "+countScore);
	}else{
	System.out.println("There are no such dayscholar students");
	}
	if(secondHighest!=null){
	System.out.println("Second Highest Score Student details: "+secondHighest.toString());
	}else{
	System.out.println("There are no student from non day scholar");
	}
	}
}


