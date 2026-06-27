import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int secret = 42; // fixed number for simplicity
        int guess;

        System.out.println("Guess the number (between 1 and 100):");
        do {
            guess = ob.nextInt();
            if (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
        } while (guess != secret);

        System.out.println("Correct! You guessed the number.");

        ob.close();
    }
}
