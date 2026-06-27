import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = ob.nextLine();

        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word = " + longest);

        ob.close();
    }
}
