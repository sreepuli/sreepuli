 class Car extends Vehicle{
	public void start(){
	System.out.println("Car started");
	}
}
public class main{
	public static void main(String[] args){
	Vehicle obj=new Vehicle();
	obj.start();
	Car car= new Car();
	car.start();
	}
}

