import java.util.Scanner;

class Sort {
	void code(){
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter the number of elements: ");
	int n = scanner.nextInt();
	int arr[] = new int[n];

	System.out.println("Enter the elements:");
	for(int i = 0; i < n; i++)
	{
	arr[i] = scanner.nextInt();
      }

      for(int i=0; i<n-1; i++)
	{
       for(int j = i + 1; j<n; j++) {
		if(arr[i] > arr[j]) {
		int temp = arr[j];
		arr[j] = arr[i];
    	      arr[i] = temp;
		}
	}
	}

        System.out.println("Sorted array in ascending order:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

class Sorting
{
	public static void main(String[] args) {
	Sort so= new Sort();
	so.code();
}
}