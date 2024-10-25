import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int secondNumber = scanner.nextInt();

            // Attempt to divide the two numbers
            int result = firstNumber / secondNumber;

            // If no exception occurs, print the result
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception if dividing by zero
            System.out.println("Error: Division by zero is not allowed.");
        } 
        finally {
            // Close the scanner
            scanner.close();
        }
    }
}