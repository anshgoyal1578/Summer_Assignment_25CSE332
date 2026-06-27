import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) { // if not already added
                result += ch;
            }
        }

        System.out.println("String without duplicates = " + result);

        ob.close();
    }
}
