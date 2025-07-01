class StringWord{
	public static void main(String args[]){
	String s = "hello I am Nikhil Ghate";
	String words[] = s.split(" ");
	String largest = words[0];
	String smallest = words[0];
	for(String word : words){
	if (word.length() > largest.length()){
	largest = word;
	}
	if(word.length() < smallest.length()){
	smallest = word;
	}
	}
	System.out.println("Smallest word is :" +smallest);
	System.out.println("larrgest word is :" + largest);
	}
}