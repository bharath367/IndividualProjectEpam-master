import java.util.Scanner;

public class main {

    private static String accountHolderName = "John";
    private static double savingsBalance = 10000.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome, " + accountHolderName + "!");
            System.out.println("1. Display cash balance");
            System.out.println("2. Withdraw cash");
            System.out.println("3. Deposit cash");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayCashBalance();
                    break;
                case 2:
                    withdrawCash();
                    break;
                case 3:
                    depositCash();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using this ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayCashBalance() {
        System.out.println("Your savings account balance is: " + savingsBalance);
    }

    private static void withdrawCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= savingsBalance) {
            savingsBalance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient funds. Please try again.");
        }
        displayCashBalance();
    }

    private static void depositCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        savingsBalance += amount;
        System.out.println("Cash deposited successfully.");
        displayCashBalance();
    }

}
