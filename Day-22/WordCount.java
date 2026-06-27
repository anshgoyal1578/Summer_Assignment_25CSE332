import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = ob.nextLine().trim();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words = " + (count + 1));

        ob.close();
    }
}
