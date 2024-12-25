class Buffer{
	public static void main(String args[]){
 	
	StringBuffer sb = new StringBuffer(30);
	 sb.append(" Java Programming");
	 System.out.println("after append "+ sb);
	 sb.insert(6, "is fun ");
	 System.out.println("after insert "+sb);
       int start = sb.indexOf("Programming");
	 int end = start+"Programming".length();
	 sb.replace(start , end ,"Language");
	 System.out.println("after replace"+sb);
	 sb.reverse();
	 System.out.println("after reverse "+sb);
	
	}
	
}