import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i) + "" + count;
                count = 1;
            }
        }

        System.out.println("Compressed string = " + result);

        ob.close();
    }
}
