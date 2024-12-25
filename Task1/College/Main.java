import java.util.Scanner;

class College {
      private int id;
      private String name;
      private int contactNo;
      private String address;
      private int pinCode;

	public College(int id, String name, int contactNo, String address, int pinCode) {
      this.id = id;
      this.name = name;
      this.contactNo = contactNo;
      this.address = address;
      this.pinCode = pinCode;
      }

	public int getId(){
	return id;
	}
	public String getName(){
	return name;
	}
	public int getContact(){
	return contactNo;
	}
	public String getAddress(){
	return address;
	}
	public int getPinCode(){
	return pinCode;
	}
}

class Solution{
	public static College findCollegeWithMaximumPincode(College[] college){
	if(college.length ==0){
	return null;
	}

	College maxPinCode = college[0];
	for(int i=1; i<college.length;i++){
	if(college[i].getPinCode() > maxPinCode.getPinCode()){
	maxPinCode = college[i];
	}
	}return maxPinCode;
	}

	public static void searchCollegeByAddress(){

	}

	
	public static void main(String args[]){
	System.out.println("Enter number of entries");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	College clg[] = new College[num];
	
	for(int i=0; i<num; i++){
	
	System.out.print("Enter the ID: ");
	int id = sc.nextInt();

	System.out.print("College Name: ");
	String name=sc.next();
	
	System.out.print("Contact No: ");
	int contact=sc.nextInt();

	System.out.print("College Address: ");
	String address=sc.next();

	System.out.print("PinCode: ");
	int PinCode=sc.nextInt();
	
	clg[i] = new College(id, name, contact, address, PinCode);
	}

	College maxPinCode = Solution.findCollegeWithMaximumPincode(clg);
	if(maxPinCode!= null){
	System.out.println("Maxumum Pincode College is: "+maxPinCode);
	}else{
	System.out.println("No College Found with Mentioned attribute");
	}
	}
}

	