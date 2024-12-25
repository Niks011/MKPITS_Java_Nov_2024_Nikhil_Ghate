import java.io.*;
import java.util.Arrays;

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

	public String toString(){
	return "College  [ id= "+id+", Name= "+name+", Contact no= "+contactNo+", Address= "+ address+", PinCode= "+pinCode+" ]";
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

	public static College searchCollegeByAddress(College[] college, String address){
	for(int i=0; i<college.length;i++){
	if(college[i].getAddress().equalsIgnoreCase(address)){
	return college[i];
	}
	}
	return null;
	}

	
	public static void main(String args[]){
	College college[] = new College[0];
	try{
	BufferedReader br= new BufferedReader(new FileReader("data.txt"));
	String line = br.readLine();
	
	while(line!=null){
	String record[]= line.split(",");
	College clg = new College(Integer.parseInt(record[0]), record[1], Integer.parseInt(record[2]), record[3], Integer.parseInt(record[4]));
	college = Arrays.copyOf(college, college.length+1);
	college[college.length-1]= clg;
	line = br.readLine();
	}
	}catch(Exception e){
	System.out.println(e);
	}
	

	College maxPinCode = Solution.findCollegeWithMaximumPincode(college);
	if(maxPinCode!= null){
	System.out.println("Maximum Pincode College is: "+maxPinCode.toString());
	}else{
	System.out.println("No College Found with Mentioned attribute");
	}

	String addressSearch = "Amravati";
	College addressMatch = Solution.searchCollegeByAddress(college, addressSearch);
	if(addressMatch!= null){
	System.out.println("college with Matched address: "+addressMatch.toString());
	}else{
	System.out.println("No College Found with Mentioned attribute");
	}
	}
	
}

	