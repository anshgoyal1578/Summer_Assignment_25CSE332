import java.util.*;

public class product {
    public static void main(String[] args) {
        int product = 1, n, n1;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter a number.");
        n = ob.nextInt();

        n1 = n; // copying the original number

        // Finding the product of digits
        while (n1 != 0) {
            product *= n1 % 10;
            n1 /= 10;
        }

        System.out.println("Product = "+product);
        ob.close();
    }
}