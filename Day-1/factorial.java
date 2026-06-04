import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int i, num, fact = 1;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the number whose factorial is to be calculated.");
        num = ob.nextInt();

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial= " + fact);

        ob.close();
    }

}
