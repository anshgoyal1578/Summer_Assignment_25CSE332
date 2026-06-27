import java.util.Scanner;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character = '" + maxChar + "' with frequency " + maxCount);

        ob.close();
    }
}
