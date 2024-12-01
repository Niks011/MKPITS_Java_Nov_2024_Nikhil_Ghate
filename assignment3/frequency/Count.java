import java.util.Scanner;

class Frequency {
	void code(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Elements");
	int n = new sc.nextInt();
	int arr[] = new int[n]

	System.out.println("Enter the Elements");           // 2 4 6 8
	for(int i=0; i<n-1; i++){
	arr[i] = new sc.nextInt();
	}

	int x;
	for(int i=0; i<n; i++){
	x = arr[i];
	int count =0;
	if(x==-1){
      continue;
      }
	for(int j=0; j<n; j++){
	if(arr[j]==x){
	count++;
	arr[j]=-1;
      }
	} System.out.println("frequency of "+ x +" is" + count);
    }
}

Class Count{
	public static void main(String args[]){
	Frequency fq =new Frequency();
	fq.code();
}
}