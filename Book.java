public class Book{
	String title;
	String author;
	double price;
	public Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public void displayInfo(){
		System.out.println("TITLE : "+title);
		System.out.println("AUTHOR: "+author);
		System.out.println("PRICE: $"+price);
	}
}

