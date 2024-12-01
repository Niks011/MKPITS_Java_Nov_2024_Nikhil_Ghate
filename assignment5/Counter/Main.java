class Product {
	static int counter = 0;
	String name;
	double price;

	public Product(String name, double price) {
	this.name = name;	
	this.price = price;
        
      counter++;
    }

	public void displayInfo() {
      System.out.println("Product Name: " + name);
      System.out.println("Product Price: " + price);
	System.out.println();
    }

   	public static void displayCount() {
      System.out.println("Number of Product instances created: " + counter);
    }
}

public class Main {
	public static void main(String[] args) {
	Product p1 = new Product("Laptop", 4500.00);
	Product p2 = new Product("Smartphone", 7999.99);
      Product p3 = new Product("Tablet", 4999.99);
      p1.displayInfo();
      p2.displayInfo();
      p3.displayInfo();

	Product.displayCount();
    }
}
