public class Book {

    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The price of the book is " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java","James Goslin",1000);
        b1.displayDetails();
    }
}

// The title of the book is Java
// The author of the book is James Goslin
// The price of the book is 1000
