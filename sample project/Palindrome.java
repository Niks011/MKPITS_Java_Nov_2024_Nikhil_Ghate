class Palindrome{
	public static boolean ispalin(String s){
	int i=0 , j= s.length()-1;
	while(i<j){
	if(s.charAt(i) != s.charAt(j)){
	return false;
	}
	i++;
	j--;
	}
	return true;
	}

	public static void main(String args[]){
	String s = "Moon";

	if(ispalin(s.toLowerCase())){
	System.out.println("String is palindrome");
	}
	else
	System.out.println("string is not Palindrome");

	}
}