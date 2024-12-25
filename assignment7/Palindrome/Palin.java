class Palin{
	public static void main(String args[]){
	String str = "madam";

	int left = 0;
	int right = str.length()-1;
	while(left<right){
	if(str.charAt(left) == str.charAt(right)){
		left++;
		right--;
		}else{
		System.out.println("String is not Palindrome");
		}
	}
	System.out.println("String is Palindrome");
	}

}