import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String Str1 = "   Heart";
    String Str2 = "earth ";
	
	String myStr1 = Str1.trim().toLowerCase();
	String myStr2 = Str2.trim().toLowerCase();

    char[] myArray1 = myStr1.toCharArray();
    char[] myArray2 = myStr2.toCharArray();

    Arrays.sort(myArray1);
    Arrays.sort(myArray2);

	if(Arrays.equals(myArray1, myArray2)){
    System.out.println("String is an Anagram String");
    }
      else{
      System.out.println("String is not Anagram");
	}
  }
}
