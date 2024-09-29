interface Calculator{
    double calculate(double a,double b);
}
class Add implements Calculator{
    @Override
    public double calculate(double a,double b){
        return a+b;
    }

}
class Subtract implements Calculator{
    @Override
    public double calculate(double a,double b){
        return a-b;
    }

}
class Multiply implements Calculator{
    @Override
    public double calculate(double a,double b){
        return a*b;
    }

}
class Division implements Calculator{
    @Override
    public double calculate(double a,double b){
        return a/b;
    }

}
public class interfaceCalculator{
    public static void main(String[] args) {
                Calculator add = new Add();
                Calculator subtract = new Subtract();
                Calculator multiply = new Multiply();
                Calculator divide = new Division();
        
                double a = 10;
                double b = 5;
        
                System.out.println("Addition: " + add.calculate(a, b));         // Output: 15.0
                System.out.println("Subtraction: " + subtract.calculate(a, b)); // Output: 5.0
                System.out.println("Multiplication: " + multiply.calculate(a, b)); // Output: 50.0
                System.out.println("Division: " + divide.calculate(a, b));       // Output: 2.0
            }
        }