import java.util.*;

public class frequency 
{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int size = ob.nextInt();

        int[] arr = new int[size];

    
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }

        
        System.out.print("Enter element to find frequency: ");
        int key = ob.nextInt();

        
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                count++;
            }
        }


        if (count == 0) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Frequency of " + key + " = " + count);
        }

        ob.close();
    }
}
