class Books{
	String bookName, authorName;
	int bookQty; 
	
	public void setbookName(String name){
	this.bookName = name;
	}
	
	public void setauthorName(String authorName){
	this.authorName = authorName;
	}
	
	public void setNumber(int num){
	this.bookQty =  num;
	}

	void Display(){
	System.out.println("Book Name is: " + bookName);
	System.out.println("Book Author Name is: " +authorName);
	System.out.println("Book Numbers of Quantity:  " + bookName);

	}
}