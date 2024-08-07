public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "Scott Fitzgerald", 10.99, 180);
        Book book2 = new Book("1984", "George Orwell", 8.99, 328);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99, 281);

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();
        System.out.println();

        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();
        System.out.println("Total price of all books: $" + totalPrice);

    }
}
