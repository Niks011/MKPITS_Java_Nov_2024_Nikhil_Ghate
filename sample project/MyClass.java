class MyClass {
public static void main(String[] args) {
String s="SACHIN";  
String c= "Sachin";
System.out.println(s.charAt(3));
System.out.println(s.codePointAt(3));
System.out.println(s.length());
int n = 5468;
System.out.println(String.valueOf(n));   //convert int to String.
System.out.println(s.replace("Sachin","Nikhil"));
if(s.compareToIgnoreCase(c)==0)
	System.out.println("Both String Are Equal");
System.out.println(s.concat(c));
System.out.println(s.replace('H', 'p'));

}
}