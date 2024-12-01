import java.util.Scanner;

class Meal{
	int tip, tax, item, price, add=0, total;
	
	void code(){
	System.out.println("Enter the number of Item Ordered");
	Scanner sc =  new Scanner(System.in);
	item = sc.nextInt();
	System.out.println("Enter their prices");
	for(int i=0; i<item; i++){
		price = sc.nextInt(); 
		add= add + price;
	}
	
	tax = add/100*12;
	if(add>=500){ 	
	tip = 20;
	total = add + tip + tax;
	System.out.println("Total bill is " + total);
	}
	else{
	total = add + tax; 
	System.out.println("Total bill is " + total);
	}

}	
}

class Restaurant{
	public static void main(String args[]){
	Meal ml = new Meal();
	ml.code();
}
}