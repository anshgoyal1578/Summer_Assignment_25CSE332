import java.util.*;

public class sum {
    public static void main(String[] args) {
        int sum = 0, n, n1;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter a number.");
        n = ob.nextInt();

        n1 = n; // copying the original number

        // Finding the sum of digits
        while (n1 != 0) {
            sum += n1 % 10;
            n1 /= 10;
        }

        System.out.println("Sum = "+sum);
        ob.close();
    }
}