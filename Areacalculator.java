public calss Areacalculator{
	public static double Areaofcircle(double r){
		return 3.14*(r*r);
	}
	public static double Areaofrectangle(double l,double b){
		return l*b;
	}
	public static double Areaoftriangle(double b,double h){
		return 0.5*b*h;
	}
public static void main(String[] args){
	Scanner input =new Scanner(Systemin);
	System.out.print("1.circle\n2.rectangle\n3.triangle\n");
	System.out.println("Enter your choice:");
	int choice = input.nextInt();
		switch(choice){
			case 1: System.out.println("Enter the radius of circle:");
				double r = input.nextDouble();
				System.out.println("Area of circle is: " + Areaofcircle(r));
				break;
			case 2:System.out.println("Enter dimensions of rectangel:");
				double l=input.nextDouble();
				double b=input.nextDouble();
				System.out.println("Area of reactangel is: " + Areaofreactangle(l,b));
				break;
