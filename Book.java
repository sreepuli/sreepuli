 public class Book{
    String title;
    String author;
    double price;
    int pages;

    public Book(String title,String author,double price,int pages){
        this.title=title;
        this.author=author;
        this.price=price;
        this.pages=pages;
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
    public int getPages(){
        return pages;
    }
    public void displayInfo(){
        System .out.println("Title= "+title);
        System .out.println("Author= "+author);
        System .out.println("Price: $ "+price);
        System .out.println("Pages= "+pages);
  }
}
