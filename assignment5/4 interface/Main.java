interface Animal{
	void eat();
	void sleep();
	void makeSounds();	

}

class Dog implements Animal{
	public void eat(){
	System.out.println("Dog is eating");
	}
	public void sleep(){
	System.out.println("Dog is sleeping");
	}
	public void makeSounds(){
	System.out.println("Dog make sound like bhook bhook..");
	System.out.println();

	}

}

class Cat implements Animal{
	public void eat(){
	System.out.println("Cat is eating");
	}
	public void sleep(){
	System.out.println("Cat is sleeping");
	}
	public void makeSounds(){
	System.out.println("Cat make sounds like Mew Mew..");
	System.out.println();

	}
}

class Bird implements Animal{
	public void eat(){
	System.out.println("Bird is eating");
	}
	public void sleep(){
	System.out.println("Bird is sleeping");
	}
	public void makeSounds(){
	System.out.println("Birs make sound like");
	System.out.println();

	}
}

class Main{
	public static void main(String args[]){
	Animal a1 = new Dog();
	a1.eat();
	a1.sleep();
	a1.makeSounds();
	
	Animal a2 = new Cat();
	a2.eat();
	a2.sleep();
	a2.makeSounds();

	Animal a3 = new Bird();
	a3.eat();
	a3.sleep();
	a3
.makeSounds();
	}

}