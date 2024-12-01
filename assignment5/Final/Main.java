final class MathConstants{

	static final double pi= 3.14;
	static final int radius=8;
	
}

class Main{
	public static void main(String args[]){
	System.out.println("value of pi is "+ MathConstants.pi);
	System.out.println("value of radius is "+ MathConstants.radius);
	double r = MathConstants.pi * MathConstants.radius * MathConstants.radius;
	System.out.println("Radius of Circle is "+ r);

	}
}