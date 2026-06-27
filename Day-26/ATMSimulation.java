import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int balance = 1000;
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = ob.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance = " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    balance += ob.nextInt();
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int amt = ob.nextInt();
                    if (amt <= balance) balance -= amt;
                    else System.out.println("Insufficient balance.");
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        ob.close();
    }
}
