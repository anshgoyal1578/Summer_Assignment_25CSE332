import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        System.out.print("Enter a character to find frequency: ");
        char ch = ob.next().charAt(0);

        int freq = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                freq++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + freq);

        ob.close();
    }
}
