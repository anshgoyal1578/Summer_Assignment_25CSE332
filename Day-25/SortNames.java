import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = ob.nextInt();
        ob.nextLine(); // consume newline

        String[] names = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) names[i] = ob.nextLine();

        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");
        for (String name : names) System.out.println(name);

        ob.close();
    }
}
