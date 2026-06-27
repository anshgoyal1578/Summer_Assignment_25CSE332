import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1: Capital of India?");
        System.out.println("a) Delhi  b) Mumbai");
        char ans1 = ob.next().charAt(0);
        if (ans1 == 'a') score++;

        System.out.println("Q2: 2 + 2 = ?");
        System.out.println("a) 3  b) 4");
        char ans2 = ob.next().charAt(0);
        if (ans2 == 'b') score++;

        System.out.println("Your score = " + score);

        ob.close();
    }
}
