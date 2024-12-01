import java.util.Scanner;

class Dupl {

    void code() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int temp[] = new int[n];

    System.out.println("Enter the Elements");    // 2 2 4 4 4 8 9
    for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
        }

    System.out.println("After removing duplicate Elements:");
    for (int i = 0; i < n; i++) {
    int j;
    for (j = 0; j < i; j++) {
    if (arr[i] == arr[j]) {
	break;  
    }
    }
    if (i == j) {
    System.out.print(" " + arr[i]);
    }
    }
}
        
}
    
class Duplicate {
    public static void main(String args[]) {
    Dupl dp = new Dupl();
    dp.code();
    }
}