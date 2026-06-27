import java.util.Scanner;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = ob.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = ob.nextInt();

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) System.out.print(arr[i] + " ");
        }

        ob.close();
    }
}
