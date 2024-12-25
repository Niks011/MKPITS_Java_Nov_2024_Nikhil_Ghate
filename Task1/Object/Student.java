import java.io.*;

class Student implements Serializable{
	private String name;
	private int marks;
	private int rollno;

	Student(String name, int marks, int rollno){
	this.name = name;
	this.marks = marks;
	this.rollno = rollno;
	}

	public String getName(){
	return name;
	}
	public int getMarks(){
	return marks;
	}
	public int getRollno(){
	return rollno;

	}
	}

