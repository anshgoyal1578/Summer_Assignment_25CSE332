import java.util.*;

public class duplicates 
{
    public static void main(String[] args) 
    
    {


        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        
        int size = ob.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }
        
        System.out.println("Duplicate elements are:");
        
        for (int i = 0; i < size; i++) 
            {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        ob.close();
    }
}
