final class Calculator{
	static final void add(int a, int b){
	final int c = a+b;
	System.out.println("Addition is "+c);
	
	}
}

class Main{
	public static void main(String args[]){
		Calculator cl = new Calculator();
		cl.add(20,10);
	}

}