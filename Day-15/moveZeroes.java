import java.util.*;

public class moveZeroes {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = ob.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }

        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < size) {
            arr[index++] = 0;
        }

        System.out.println("Array after moving zeroes to end:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        ob.close();
    }
}
