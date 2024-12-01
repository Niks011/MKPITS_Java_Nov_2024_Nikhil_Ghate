import java.util.Scanner;

class Large {
    int a, secondLargest;

    void code() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elements");    // 2 4 8 6 9
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        a = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > a) {
                secondLargest = arr[i];
                a = arr[i];
                
            }else if (arr[i] > secondLargest && arr[i] < a) {
                secondLargest = arr[i];
        }
        
        // secondLargest = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] > secondLargest && arr[i] < a) {
        //         secondLargest = arr[i];
        //     }
        // }
        // System.out.println("Second Largest element is: " + secondLargest);
    }System.out.println("Largest element is: " + secondLargest);

}
}

class Largest {
    public static void main(String args[]) {
        Large lg = new Large();
        lg.code();
    }
}