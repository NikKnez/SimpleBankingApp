import java.util.Scanner;

public class Main {
    private static double balance = 0; // Initial balance is 0
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> checkBalance();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
    }

    private static void displayMenu() {
        System.out.println("Simple Banking Application");
        System.out.println("==========================");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
        System.out.println("Current balance: $" + balance);
        System.out.println();
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
        }
        System.out.println("Current balance: $" + balance);
        System.out.println();
    }

    private static void checkBalance() {
        System.out.println("Current balance: $" + balance);
        System.out.println();
    }


}
