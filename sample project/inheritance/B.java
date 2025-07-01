class B extends A{
	private int num2;

	public B(){
	this.num2=200;
	}
	
	public void display(){
	super.display();
	System.out.println(num2);
	}
}