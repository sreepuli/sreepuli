import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking an integer input
            System.out.print("Enter an integer: ");
            String integerInput = sc.next();
            int number = Integer.parseInt(integerInput);
            // Taking a string input
            System.out.print("Enter a string: ");
            String strInput = sc.next();
            // Print the inputs to verify
            System.out.println("You entered the integer: " + number);
            System.out.println("You entered the string: " + strInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input mismatch. Please enter valid values.");
        } 
        finally {
                sc.close();
        }
    }
}
