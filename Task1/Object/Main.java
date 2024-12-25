import java.io.*;
class Main{
	public static void main(String args[]){
	Student st =  new Student("Nikhil", 89, 20);
	Student st1 =  new Student("Rajesh", 99, 22);
	Student st2 =  new Student("Kumar", 78, 24);
	try{
	ObjectOutputStream obj1 = new ObjectOutputStream(new FileOutputStream("abc.txt"));
	obj1.writeObject(st);
	obj1.writeObject(st1);
	obj1.writeObject(st2);

	obj1.close();

	ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("abc.txt"));
	System.out.println(st.getName());
	System.out.println(st.getMarks());
	System.out.println(st.getRollno());
	System.out.println();

	System.out.println(st1.getName());
	System.out.println(st1.getMarks());
	System.out.println(st1.getRollno());
	System.out.println();

	System.out.println(st2.getName());
	System.out.println(st2.getMarks());
	System.out.println(st2.getRollno());
	

	}catch(Exception e){
	System.out.println(e);	}
	}
}