import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String str = ob.nextLine();

        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - 32);
            } else {
                upper += ch;
            }
        }

        System.out.println("Uppercase string = " + upper);

        ob.close();
    }
}
