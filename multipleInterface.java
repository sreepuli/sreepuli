interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck can fly");
    }
    @Override
    public void swim(){
        System.out.println("Duck can swim");
    }
}
public class multipleInterface{
    public static void main(String[] args) {
        Duck duck=new Duck();
        System.out.println("DUCK");
        duck.fly();
        duck.swim();
    }
}