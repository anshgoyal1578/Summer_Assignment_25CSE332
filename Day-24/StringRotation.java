import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = ob.nextLine();

        System.out.print("Enter second string: ");
        String str2 = ob.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation.");
        } else {
            String temp = str1 + str1; // concatenate
            if (temp.contains(str2)) {
                System.out.println("Strings are rotations of each other.");
            } else {
                System.out.println("Not a rotation.");
            }
        }

        ob.close();
    }
}
