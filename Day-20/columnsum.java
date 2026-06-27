import java.util.Scanner;

public class columnsum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = ob.nextInt();
        System.out.print("Enter number of columns (m): ");
        int m = ob.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = ob.nextInt();
            }
        }

        System.out.println("Column-wise sums:");
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }

        ob.close();
    }
}
