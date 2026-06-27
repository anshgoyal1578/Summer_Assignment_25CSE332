import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = ob.nextInt();

        if (age >= 18) System.out.println("Eligible to vote.");
        else System.out.println("Not eligible to vote.");

        ob.close();
    }
}
