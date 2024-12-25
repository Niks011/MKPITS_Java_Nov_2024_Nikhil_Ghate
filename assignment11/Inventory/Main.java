import java.util.ArrayList;

class Product{

    int productID;
    String name;
    int quantity;
    double price;

   
    public Product(int productID, String name, int quantity, double price) {
    this.productID = productID;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    }
	public int getProductId() {
        return productID;
    }
	public String getName() {
        return name;
    }
      public int getQuantity() {
        return quantity;
    }
      public double getPrice() {
        return price;
    }
      public String toString() {
        return "ProductID: " + productID + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    	}
	
}

class Inventory{	
	ArrayList<Product> products = new ArrayList<>();

	public void addProduct(int id, String name, int quantity, double price){
	products.add(new Product(id, name, quantity, price));
	System.out.println("Product added successfully");
	}

	public void updateQuantity(int id, int quantity){
	for(int i=0; i<products.size(); i++){
	if(products.get(i).getProductId()== id){
	products.get(i).set(2, quantity);
	return;
	}
	}System.out.println("No record found for given ID-");
	}
	
	public void removeProduct(int id){
	for(int i=0; i<products.size(); i++){
	if(products.get(i).getProductId()==id){
	products.get(i).remove(products.get(i));
	System.out.println("Product removed..");
	return;
	}
	}
	}

	public void display(){
	System.out.println(Product.toString());
	}
}

class Main{
	public static void main(String args[]){
	Inventory inventory = new Inventory();
	
	inventory.addProduct(1, "Shoes", 20, 4500);
	inventory.addProduct(2, "Shirt", 40, 700);
	inventory.addProduct(3, "Wallet", 10, 400);
	inventory.addProduct(4, "Bags", 24, 800);

	inventory.display();

	inventory.updateQuantity(2, 10);
	inventory.display();

	inventory.removeProduct(4);
	inventory.display();
	
	}

}