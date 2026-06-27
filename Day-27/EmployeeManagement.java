import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String[] names = new String[10];
        int[] salary = new int[10];
        int count = 0, choice;

        do {
            System.out.println("\n1. Add Employee\n2. View Employees\n3. Exit");
            choice = ob.nextInt();
            ob.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    names[count] = ob.nextLine();
                    System.out.print("Enter salary: ");
                    salary[count] = ob.nextInt();
                    count++;
                    break;
                case 2:
                    for (int i = 0; i < count; i++)
                        System.out.println(names[i] + " - " + salary[i]);
                    break;
            }
        } while (choice != 3);

        ob.close();
    }
}
