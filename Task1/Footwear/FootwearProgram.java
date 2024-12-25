import java.util.Scanner;

class FootwearProgram{	
	public static void main(String args[]){

	System.out.println("Enter the number of Entries");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Footwear footwear[] = new Footwear[num];

	for(int i=0; i<num; i++){
	System.out.print("Enter Brand Name: ");
	String BrandName = sc.next();
	
	System.out.print("Footwear Type: ");
	String fType = sc.next();

	System.out.print("Price: ");
	int price = sc.nextInt();
	System.out.println();

	footwear[i] = new Footwear(BrandName, fType, price);
	}
	System.out.print("Enter Footwear Type: ");
	String type = sc.next();
	
	int count = Solution.getCountByType(footwear, type);
	if(count>0){
	System.out.println("Count of Footwear type "+type+ " is: " + count);
	}else{
	System.out.println("Footwear not available");
	}

	System.out.println("Enter Footwear Brand");
	String brand = sc.next();
	Footwear secondHighest = Solution.getSecondHighestPriceByBrand(footwear, brand);
	System.out.println("Second Highest Price for brand "+brand+" is"+secondHighest);
}
}