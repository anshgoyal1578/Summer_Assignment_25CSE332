import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String[] names = new String[10];
        int[] marks = new int[10];
        int count = 0, choice;

        do {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            choice = ob.nextInt();
            ob.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    names[count] = ob.nextLine();
                    System.out.print("Enter marks: ");
                    marks[count] = ob.nextInt();
                    count++;
                    break;
                case 2:
                    for (int i = 0; i < count; i++)
                        System.out.println(names[i] + " - " + marks[i]);
                    break;
            }
        } while (choice != 3);

        ob.close();
    }
}
