import java.util.Scanner;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = ob.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = ob.nextInt();

        System.out.print("Enter target sum: ");
        int target = ob.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No pair found.");

        ob.close();
    }
}
