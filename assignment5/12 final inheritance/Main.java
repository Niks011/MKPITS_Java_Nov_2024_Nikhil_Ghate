class Person {
    String name;
    int age;

    Person(String name, int age) {
	this.name = name;
	this.age = age;
    }
    final void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
	String studentId;
	Student(String name, int age, String studentId) {
	super(name, age);
	this.studentId = studentId;
    }
	void displayStudentInfo() {
      System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {
	String teacherId;
      
	Teacher(String name, int age, String teacherId) 
	{
	super(name, age);
	this.teacherId = teacherId;
    }
	void displayTeacherInfo() {
      System.out.println("Teacher ID: " + teacherId);
    }
}

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Nikhil Ghate", 25, "S12345");
        st.displayInfo(); 
        st.displayStudentInfo();

        System.out.println();
        Teacher tr = new Teacher("Mr. Smith", 40, "T98765");
        tr.displayInfo(); 
        tr.displayTeacherInfo(); 
    }
}
