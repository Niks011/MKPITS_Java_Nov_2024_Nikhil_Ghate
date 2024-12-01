import java.util.Scanner;
class Choice
{
	void check()
	{
	System.out.println("Enter the Month '1-12' ");
	Scanner sc=new Scanner(System.in);
	int month = sc.nextInt();
	System.out.println("Enter the Year");
	int year = sc.nextInt();
        
	switch(month)
	{
        case 1: System.out.println("Month is : January and total days are 31");
                 break;
        case 2: System.out.println("Month is : February and total days are 29");
                 break;
        case 3: System.out.println("Month is :  March and total days are 31");
                 break;
        case 4: System.out.println("Month is :  April and total days are 30");
                 break;
        case 5: System.out.println("Month is :  May and total days are 31");
                 break;
        case 6: System.out.println("Month is :  June and total days are 30");
                 break;
        case 7: System.out.println("Month is :  July and total days are 31");
                 break;
        case 8: System.out.println("Month is :  August and total days are 31");
                 break;
        case 9: System.out.println("Month is :  September and total days are 30");
                 break;
        case 10: System.out.println("Month is :  October and total days are 31");
                 break;
        case 11: System.out.println("Month is :  November and total days are 30");
                 break;
        case 12: System.out.println("Month is :  December and total days are 31");
                break;
        default : System.out.println("invalid Date or Year");
	 }
	}
}
class Month
{
	public static void main(String args[])
	{
	Choice ch = new Choice();
	ch.check();
}

}