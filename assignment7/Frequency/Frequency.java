class Frequency{
	public static void main(String args[]){
	String str = "niikhhill";
	char ch[] = str.toCharArray();

	for(int i=0; i<str.length();i++){
	char c = ch[i];
	int count = 0;	
	if(c == ' '){
		continue;
		}
	 for(int j=0; j<str.length(); j++){
		if(c == ch[j]){
		count++;
		ch[j] = ' ';
		}
	}
		System.out.println("count of "+c+ "is " +count);
	}
		
	}
	
}