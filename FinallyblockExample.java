
import java.util.Scanner;

public class FinallyblockExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a integer");
            int number = sc.nextInt();
            int result=100/number;
            System.out.println("the result of division is: "+result);
        } catch (ArithmeticException e) {
            System.out.println("Error:DIVISION BY ZERO IS NOT ALLOWED");
        }
        finally{
            System.out.println("Excecution completed");
            sc.close();
        }
    
    }
}