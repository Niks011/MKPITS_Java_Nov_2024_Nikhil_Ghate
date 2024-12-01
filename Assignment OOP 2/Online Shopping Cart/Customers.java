class Customers{
	private String name, email, address;
	private int number, pincode;
	
	public void setName(String name){
	this.name = name;
	}
	
	public void setAddress(String address){
	this.address = address;
	}
	
	public void setEmail(String email){
	this.email= email;
	}
	public void setPinCode(int pincode){
	this.pincode = pincode;
	}
	public void setNumber(int number){
	this.number= number;
	}


	public String getName(){
	return name;
	}
	public String getAddress(){
	return address;
	}
	public String getEmail(){
	return email;
	}
	public int getPinCode(){
	return pincode;
	}
	public int getNumber(){
	return number;
	}

}