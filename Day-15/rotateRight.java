import java.util.*;

public class rotateRight 
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = ob.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = ob.nextInt();
        }

        System.out.print("Enter number of positions to rotate right: ");
        int k = ob.nextInt();
        k = k % size;

        System.out.println("Array after right rotation:");
        for (int i = size - k; i < size; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size - k; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        ob.close();
    }
}
