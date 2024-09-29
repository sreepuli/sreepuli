interface Vehicle{
    void start();
    void stop();
    default void Honk(){
        System.out.println("Honk!");
    }
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("car starts");
    }
    @Override
    public void stop(){
        System.out.println("car stops");
    }
}
class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike starts");
    }
    @Override
    public void stop(){
        System.out.println(" BIKE stops");
    }
}
public class interfaceVehicle{
    public static void main(String[] args) {
        Vehicle mycar=new Car();
        Vehicle myBike=new Bike();
        System.out.println("CAR");
        mycar.start();
        mycar.Honk();
        mycar.stop();
        System.out.println("\nBIKE");
        myBike.start();
        myBike.Honk();
        myBike.stop();
    }
}