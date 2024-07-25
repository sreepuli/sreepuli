import java.util.Scanner;
public class simplecal{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a value");
	double a=input.nextDouble();
	System.out.println("Enter b value");
	double b=input.nextDouble();
	System.out.println("choose the operator(+,-,*,/)");
	char ch=input.next().charAt(0);
	double result; 
	switch(ch){
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("Invalid operator");
			return;
	}
		System.out.println("the result is "+result);
}
}

