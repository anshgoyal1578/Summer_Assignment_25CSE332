import java.util.*;

public class linearSearch 

{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int size = ob.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = ob.nextInt();

        // Linear search logic
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        // Output result
        if (pos == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position: " + (pos + 1));
        }

        ob.close();
    }
}
