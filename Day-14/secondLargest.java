import java.util.*;

public class secondLargest 
{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int size = ob.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[size];

        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }

        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Second largest element = " + secondLargest);
        }

        ob.close();
    }
}
