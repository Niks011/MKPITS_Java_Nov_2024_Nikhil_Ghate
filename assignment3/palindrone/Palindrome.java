import java.util.Scanner;

class Palin
{
	void code(){
	System.out.println("Enter the Length of Array");
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	int arr[] = new int[num];
	
	System.out.println("Enter the String");
	for(int i=0; i<num;i++){
	arr[i] = sc.nextInt();
      }

      int i,j;
      for(i=0, j=num-1; i<=j; i++,j--)
      {
	if(arr[i]!=arr[j]){                 //2 5 5 2
	System.out.println("array is not palendrone");
	break;
      } 
      }
      if(i>j){
      System.out.println("array is palendrone");
      }
      }
}

class Palindrome{
    public static void main(String[] args) {
    Palin pl =new Palin();
    pl.code();
    }
}