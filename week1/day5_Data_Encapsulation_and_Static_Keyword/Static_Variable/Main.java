package week1.day5_Data_Encapsulation_and_Static_Keyword.Static_Variable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting customer details
        System.out.println("Enter the name");
        String customerName = scanner.nextLine();
        System.out.println("Enter the account type [Current, Savings, Demat]");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter the balance");
        double accountBalance = scanner.nextDouble();

        // Creating customer object
        customer customer = new customer(customerName, accountNumber, accountBalance);

        int choice = 0;

        // Transactions
        while (choice != 3) {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    customer.withdrawal(withdrawAmount);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        System.out.println("Number of transactions done: " + customer.getNumberOfTransactions());

    }
}
