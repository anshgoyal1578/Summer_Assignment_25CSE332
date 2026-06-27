import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = ob.nextLine();

        String[] words = str.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) System.out.println(word);

        ob.close();
    }
}
