import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = ob.nextInt();
        System.out.print("Enter size of second array: ");
        int m = ob.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] merged = new int[n + m];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) arr1[i] = ob.nextInt();

        System.out.println("Enter second array:");
        for (int i = 0; i < m; i++) arr2[i] = ob.nextInt();

        for (int i = 0; i < n; i++) merged[i] = arr1[i];
        for (int i = 0; i < m; i++) merged[n + i] = arr2[i];

        System.out.println("Merged array:");
        for (int x : merged) System.out.print(x + " ");

        ob.close();
    }
}
