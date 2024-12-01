import java.util.Scanner;

class Expo{
	
int base, exp, pow=1;
	
	void code(){

	Scanner sc =  new Scanner(System.in);

	System.out.println("Enter the Base number");
	base = sc.nextInt();
	System.out.println("Enter the Exponent");
	exp = sc.nextInt();


	for(int i=0; i<exp; i++){
	pow = pow * base;
	}
	System.out.println(base+"^"+exp +" is: " + pow);
	}
}

class Power{
	public static void main(String args[]){
	Expo ex = new Expo();
	ex.code();
}
}