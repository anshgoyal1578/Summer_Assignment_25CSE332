import java.util.*;

public class stringlength {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        int length = 0;

        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("Length of the string = " + length);

        ob.close();
    }
}
