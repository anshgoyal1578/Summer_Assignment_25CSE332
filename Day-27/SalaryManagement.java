import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String[] empNames = new String[10];
        int[] empSalary = new int[10];
        int count = 0, choice;

        do {
            System.out.println("\n--- Salary Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = ob.nextInt();
            ob.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    empNames[count] = ob.nextLine();
                    System.out.print("Enter salary: ");
                    empSalary[count] = ob.nextInt();
                    count++;
                    break;

                case 2:
                    System.out.println("\nEmployee Records:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(empNames[i] + " - " + empSalary[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter employee number (1 to " + count + "): ");
                    int idx = ob.nextInt() - 1;
                    if (idx >= 0 && idx < count) {
                        System.out.print("Enter new salary: ");
                        empSalary[idx] = ob.nextInt();
                        System.out.println("Salary updated.");
                    } else {
                        System.out.println("Invalid employee number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Salary Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        ob.close();
    }
}
