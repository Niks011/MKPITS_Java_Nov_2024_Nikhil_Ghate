import java.util.Scanner;
public class MergeArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements for the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements for the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];

   
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = array2[i];
        }

        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }
}