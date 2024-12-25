import java.util.*;

class Student {
	int id;
	String name;
	double grade;

      Student(int id, String name, double grade) {
      this.id = id;
      this.name = name;
      this.grade = grade;
    	}

	public int getId(){
	return id;
	}
	public String getName(){
	return name;
	}
	public double grade(){
	return grade;
	}

	public String toString(){
	return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
	}
}

class StudentManagementSystem {
      List<Student> students = new ArrayList<>();

      public void addStudent(int id, String name, double grade) {
      students.add(new Student(id, name, grade));
      System.out.println("Student added.");
	System.out.println();
    	}

      public void removeStudent(int id) {
      Student studentToRemove = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
	if (studentToRemove != null) {
      students.remove(studentToRemove);
      System.out.println("Student removed successfully.");
	}else{
      System.out.println("Student Not Found.");
      }
	}

      public void searchStudent(int id) {
      for (Student student : students) {
      if (student.getId() == id) {
      System.out.println(student.toString());
	System.out.println();
      return;
      }
      }
        System.out.println("Student with ID " + id + " not found.");
		System.out.println();

    	}

      public void displayAll() {
      for (Student student : students) {
            System.out.println(student.toString());
		System.out.println();

    	}
	}
}

class Main{
	public static void main(String args[]){
	StudentManagementSystem students = new StudentManagementSystem();
	Scanner sc = new Scanner(System.in);
      while(true){    
	System.out.println();  
	System.out.println("Enter your choice: ");
	System.out.println("1. Add Student");
      System.out.println("2. Remove Student by ID");
      System.out.println("3. Search Student by ID");
      System.out.println("4. Display All Students");
      System.out.println("5. Display Students Sorted by Grade");
	
	int choice = sc.nextInt();
	switch(choice){
	case 1:{ System.out.println("Enter Student ID");
			int id = sc.nextInt();
			sc.nextLine();
		  System.out.println("Enter Name");
			String name =  sc.nextLine();
		  System.out.println("Enter Grade");
			double grade = sc.nextDouble();
		  students.addStudent(id, name, grade);
			break; }
	
	case 2:{ System.out.println("Enter id to Remove Student");
			int id = sc.nextInt();
		  students.removeStudent(id);
			break; }

	case 3:{ System.out.println("Enter Id to Search student");
			int id = sc.nextInt();
		  students.searchStudent(id);
			break; }

	case 4: students.displayAll();
			break;

	case 5: System.exit(0);
		
	default:
              System.out.println("Invalid choice. Please try again.");
			}
	}
	}
	
}


