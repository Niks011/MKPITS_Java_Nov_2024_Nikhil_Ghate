class Occurance{
	public static void main(String args[]){
	int arr[] = {1,2,1,5,5,4,1};
	for(int i : arr){
	int count = 0;
	if(i == -1){
	continue;
	}
	for(int j=0; j<arr.length; j++){
		if(arr[j]==i){
		count++;
		arr[j] = -1;
		}
	}
	System.out.println(i+" : "+count);
	}
	}
}