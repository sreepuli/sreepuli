public class Rectmain{
	public static void main(String[] args){
		Rectangle R1= new Rectangle(10.00,20.00);
		System.out.println("original dmensions : ");
		System.out.println("Length =" + R1.getLength());
		System.out.println("width =" + R1.getWidth());
		
		R1.resizeRectangle(R1,30.00,40.00);
		System.out.println("Modified dimensions : ");
		System.out.println("Length =" + R1.getLength());
		System.out.println("Width =" + R1.getWidth());
		
	}
}
		
		
		
		
