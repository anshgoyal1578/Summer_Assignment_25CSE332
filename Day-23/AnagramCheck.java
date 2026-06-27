import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = ob.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = ob.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams.");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are anagrams.");
            } else {
                System.out.println("Not anagrams.");
            }
        }

        ob.close();
    }
}
