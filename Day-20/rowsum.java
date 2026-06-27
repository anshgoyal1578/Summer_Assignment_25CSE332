import java.util.*;

public class rowsum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = ob.nextInt();
        System.out.print("Enter number of columns: ");
        int m = ob.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = ob.nextInt();
            }
        }

        System.out.println("Row-wise sums:");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

        ob.close();
    }
}
