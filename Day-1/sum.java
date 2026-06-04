// Calculates the sum of natural numbers from '1' to 'N'

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int N, i, sum = 0;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the range 'N'.");
        N = ob.nextInt();

        for (i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("sum of N natural numbers are:" + sum);

        ob.close();
    }
}