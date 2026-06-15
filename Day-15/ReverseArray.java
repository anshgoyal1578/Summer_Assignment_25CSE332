import java.util.*;

public class ReverseArray 
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

        System.out.println("Reversed array:");


        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        ob.close();
    }
}
