class Product{
	
	String productName, certification;
	int manufactureDate, quantity, expiry , price;

	
	public void setProductName(String productName){
	this.productName = productName;
	}
	
	public void setCertification(String certification){
	this.certification = certification;
	}
	
	public void setManufactureDate(int manufactureDate){
	this.manufactureDate = manufactureDate;
	}
	public void setQuantity(int quantity){
	this.quantity = quantity;
	}
	public void setExpiry(int expiry){
	this.expiry = expiry;
	}
	public void setPrice(int price){
	this.price =  price;
	}


	public String getProductName(){
	return productName;
	}
	public String getCertification(){
	return certification;
	}
	public int getManufactureDate(){
	return manufactureDate;
	}
	public int getQuantity(){
	return quantity;
	}
	public int getExpiry(){
	return expiry;
	}
	public int getPrice(){
	return price;
	}
}