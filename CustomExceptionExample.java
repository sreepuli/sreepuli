
import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomExceptionExample{
    public static void checkAge(int age) throws 
    InvalidAgeException{
        if (age<0 ||age>150){
            throw new InvalidAgeException("Age id between 0 and 150");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        try {
            int Age= sc.nextInt();
            checkAge(Age);
            System.out.println("Your age is "+Age);
        } catch (InvalidAgeException e) {
            System.out.println("Erroe:"+e.getMessage());
        }
        finally{
            sc.close();
        }
   

    }
}