import java.util.Scanner;

public class MarksheetGeneration {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = ob.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = ob.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = ob.nextInt();
            total += marks[i];
        }

        double percentage = (double) total / n;

        System.out.println("\n--- Marksheet ---");
        System.out.println("Name: " + name);
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 60) System.out.println("Result: First Division");
        else if (percentage >= 45) System.out.println("Result: Second Division");
        else if (percentage >= 33) System.out.println("Result: Third Division");
        else System.out.println("Result: Fail");

        ob.close();
    }
}
