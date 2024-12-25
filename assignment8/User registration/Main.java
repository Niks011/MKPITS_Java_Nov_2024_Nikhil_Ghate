import java.util.Scanner;

class Register{
	void format(String email) throws InvalidEmailException{
	if(email.contains("@gmail.com")){
	System.out.println("Your Email Format is Correct..");
	}else{
	throw new InvalidEmailException();
	}
	}
}


class Main{
	public static void main(String args[]){
	System.out.println("Enter the Email");
	Scanner sc = new Scanner(System.in);
	String email = sc.nextLine();
	Register rs = new Register();

	try{
	rs.format(email);
	}catch(Exception e){
	System.out.println(e.getMessage());
	}
	}

}