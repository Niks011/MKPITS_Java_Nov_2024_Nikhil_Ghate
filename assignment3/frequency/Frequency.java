import java.util.Scanner;

class Counter {

    void code() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    

    System.out.println("Enter the Elements");    // 2 2 4 4 4 8 9
    for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
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
            
        }System.out.println("frequency of "+ x +" is" + count);
    }
    
    }
}
class Frequency {
    public static void main(String args[]) {
    Counter ct = new Counter();
    ct.code();
    }
}