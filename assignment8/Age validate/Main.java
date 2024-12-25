import java.util.Scanner;
class Age{
	
	void validateAge(int age) throws InvalidAgeException{
	
	if(age<18){
	throw new InvalidAgeException();
	}
	System.out.println("User is Eligible");
	}

	
}

class Main{
	public static void main(String args[]){
		Age age = new Age();
		try{
		age.validateAge(16);
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
		
	}
}