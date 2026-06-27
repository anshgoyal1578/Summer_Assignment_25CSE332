import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome string.");
        } else {
            System.out.println("Not a palindrome string.");
        }

        ob.close();
    }
}
