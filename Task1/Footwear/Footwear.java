class Footwear {
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(String footwearName, String footwearType, int price) {
    this.footwearName = footwearName;
    this.footwearType = footwearType;
    this.price = price;
    }


    public String getFootwearName() {
    return footwearName;
    }

    public String getFootwearType() {
    return footwearType;
    }

    public int getPrice() {
    return price;
    }
	
	public String toString(){
	return " Footwear [Name: " + footwearName + ", Type: " + footwearType + ", Price: " + price + "]";	}
}
	