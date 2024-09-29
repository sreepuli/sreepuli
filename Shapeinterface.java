interface Shape{
    double getArea();
}
class Rectangle implements Shape{
    double len;
    double Wid;
    public Rectangle(double len,double Wid){
        this.len=len;
        this.Wid=Wid;
    }
    @Override
    public double getArea(){
        return len*Wid;
    
    }
    }
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
class Triangle implements Shape{
    double b;
    double h;
    Triangle(double b,double h){
        this.b=b;
        this.h=h;
    }
        @Override
    public double getArea(){
        return 0.5*b*h;
    
    }
}
public class Shapeinterface{
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(10,20);
        Shape circle=new Circle(5);
        Shape triangle=new Triangle(4,6);
        System.out.println("rectangle area :" + rectangle.getArea());
        System.out.println("circle area :"+circle.getArea());
        System.out.println("triangle area :" +triangle.getArea());
    }
    }
