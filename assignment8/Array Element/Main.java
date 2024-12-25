import java.util.Scanner;

class Arrays{
	void elements(){
	System.out.println("Enter the Index");
	Scanner sc = new Scanner(System.in);
	int index = sc.nextInt();
	int element[] = {122,462,663,44,215};
	
	try{
	System.out.println(element[index]);
	}catch(Exception e){
	System.out.println("re-enter valid index");
	}
	}
}

class Main{
	public static void main(String args[]){
	Arrays arr = new Arrays();
	arr.elements();
	}
		
}