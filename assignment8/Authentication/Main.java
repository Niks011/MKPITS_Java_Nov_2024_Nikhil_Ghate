import java.util.Scanner;

class Authentication {
	

	void display(String username , String password) throws AuthenticationException
	{
	if(username.equals("") || password.equals("")){
	throw new AuthenticationException();
	}else{
	System.out.println("Authentication Successfull");
	}
	}

}

class Main{
	public static void main(String args[]){
	Authentication auth = new Authentication();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the username");
	String username = sc.nextLine();
	System.out.println("Enter the password");
	String password = sc.nextLine();

	try{
	auth.display(username, password);
	}catch(Exception e){
	System.out.println(e.getMessage());
	}
	}

}