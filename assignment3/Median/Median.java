import java.util.Scanner;

class Sort {
	void code(){
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter the number of elements: ");
	int n = scanner.nextInt();
	int arr[] = new int[n];
    	int arrr[] = new int[n];

	System.out.println("Enter the elements:");
	for(int i = 0; i < n; i++)
	{
	arr[i] = scanner.nextInt();
      }

     
	 for(int i=0; i<n-1; i++)
	{
       for(int j = i + 1; j<n; j++) {        // 5 4 6 1 2
		if(arr[i] > arr[j]) {
		int temp = arr[j];
		arr[j] = arr[i];
    		arr[i] = temp;
		}
	}
	}
      if(arr.length%2==0)
      {
	double medd = (arr.length/2) + ((arr.length-1)/2)/2;
	System.out.println("Median is " + medd);
	}
	else
	{
	int med= arr.length/2;
	System.out.println(arr[med]);
	}  
	        
    }
}

class Median
{
	public static void main(String[] args) {
	Sort so= new Sort();
	so.code();
}
}