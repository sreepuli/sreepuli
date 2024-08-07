public class Rectangle{
	double length;
	double width;
	public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public void setLength(double length){
		this. length=length;
	} 
	public void setWidth(double width){
		this.width=width;
	}
	public void resizeRectangle(Rectangle rect,double newLength,double newWidth){
		rect.setLength(newLength);
		rect.setWidth(newWidth);
	}
}
