import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to simulate withdrawing money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Error: Insufficient funds for this withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0);

        System.out.print("Enter the amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        System.out.println("Attempting to withdraw $" + amountToWithdraw + "...");

        try {
            account.withdraw(amountToWithdraw);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}