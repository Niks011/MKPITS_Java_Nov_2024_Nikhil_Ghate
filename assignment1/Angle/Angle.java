
class Check
{
	void code(int x)
	{
	if(x== 90){
	System.out.println("The Angle is Right Angle");
	}
	else if(x==180){
	System.out.println("The Angle is Straight Angle");
	}
	else if(x>90){
	System.out.println("The Angle is Obtuse Angle");
	}
	else if(x<90){
	System.out.println("The Angle is Acute Angle");
	}
	
	}	
}
class Angle
{
	public static void main(String args[])
	{
		Check ck = new Check();
		ck.code(95);
	}
}