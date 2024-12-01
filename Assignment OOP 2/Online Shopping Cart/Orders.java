class Orders{

	private int orderId, shippingDate, trakingId, deliveryDate;
	private String sallerDetails;
	
	public void setOrderId(int orderId){
	this.orderId = orderId;
	}
	
	public void setShippingDate(int shippingDate){
	this.shippingDate = shippingDate;
	}
	
	public void setTrakingId(int trakingId){
	this.trakingId =  trakingId;
	}
	public void setDeliveryDate(int deliveryDate){
	this.deliveryDate = deliveryDate;
	}
	public void setSallerDetails(String sallerDetails){
	this.sallerDetails =  sallerDetails;
	}


	public int getOrderId(){
	return orderId;
	}
	public String getSallerDetails(){
	return sallerDetails;
	}
	public int getShippingDate(){
	return shippingDate;
	}
	public int getTrakingId(){
	return trakingId;
	}
	public int getDeliveryDate(){
	return deliveryDate;
	}

}

	