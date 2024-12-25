import java.util.Scanner;

class StringOp{
	public static void main(String args[]){
	System.out.println("Enter the String");
	Scanner sc= new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println("Length of the String is : "+ s.length());
	System.out.println("SubString from index 5 to 10 is : "+s.substring(5,10));
	System.out.println("String in Uppercase : "+s.toUpperCase());
	System.out.println("String in Lowercase : "+s.toLowerCase());
}
}