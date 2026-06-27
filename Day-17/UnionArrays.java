import java.util.Scanner;

public class UnionArrays {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = ob.nextInt();
        System.out.print("Enter size of second array: ");
        int m = ob.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) arr1[i] = ob.nextInt();

        System.out.println("Enter second array:");
        for (int i = 0; i < m; i++) arr2[i] = ob.nextInt();

        System.out.println("Union of arrays:");
        for (int i = 0; i < n; i++) System.out.print(arr1[i] + " ");
        for (int i = 0; i < m; i++) {
            boolean present = false;
            for (int j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    present = true;
                    break;
                }
            }
            if (!present) System.out.print(arr2[i] + " ");
        }

        ob.close();
    }
}
