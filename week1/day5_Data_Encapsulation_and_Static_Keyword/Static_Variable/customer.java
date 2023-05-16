package week1.day5_Data_Encapsulation_and_Static_Keyword.Static_Variable;

public class customer {
    private String customerName;
    private String accountNumber;
    private double accountBalance;
    private static int numberOfTransactions;

    // Constructor
    public customer(String customerName, String accountNumber, double accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Functions
    public void deposit(double amount) {
        accountBalance += amount;
        numberOfTransactions++;
        System.out.println("Your balance after the transaction is : " + accountBalance);
    }

    public void withdrawal(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            numberOfTransactions++;
            System.out.println("Your balance after the transaction is : " + accountBalance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Static variable getter
    public static int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}
