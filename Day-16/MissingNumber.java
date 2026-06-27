import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter n (range 1..n): ");
        int n = ob.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = ob.nextInt();
            sum += arr[i];
        }

        int total = n * (n + 1) / 2;
        System.out.println("Missing number = " + (total - sum));

        ob.close();
    }
}
