import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = ob.nextLine();

        System.out.print("Enter second string: ");
        String str2 = ob.nextLine();

        System.out.println("Common characters:");
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }

        ob.close();
    }
}
