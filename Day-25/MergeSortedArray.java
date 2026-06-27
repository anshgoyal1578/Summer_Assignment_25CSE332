import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = ob.nextInt();
        System.out.print("Enter size of second array: ");
        int m = ob.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n; i++) arr1[i] = ob.nextInt();

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < m; i++) arr2[i] = ob.nextInt();

        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }
        while (i < n) merged[k++] = arr1[i++];
        while (j < m) merged[k++] = arr2[j++];

        System.out.println("Merged sorted array:");
        for (int x : merged) System.out.print(x + " ");

        ob.close();
    }
}
