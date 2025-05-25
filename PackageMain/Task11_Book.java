public class Task11_Book {
        
    // Task: 
    // Create a Java class to represent a Book and implement a constructor to initialize its attributes.

    // Instructions:
    // Create a new Java class called "Book" with the following attributes.

    // -String title
    // -String author 
    // -int yearPublished
    // -double price

    // implement a constructor in the Book class that takes four parameters correspodning to the attributs and initializes them.
    // Create a main method in a seperate class to test the constructor:
    // -Instantiate three Book objects with different values using the costructor.
    // -Print out the details of each book (title, author, yearPublished, and price) usitng toString(); method.

    // Example output:

    // Book 1:
    // Title: "Java Programming"
    // Author: "John Smith"
    // Year Published: 2021
    // Price: $39.99

    // Book 2:
    // Title: "Python Basics"
    // Author: "Jane Doe"
    // Year Published: 2020
    // Price: $29.99

    // Book 3:
    // Title: "C++ Essentials"
    // Author: "Michael Johnson"
    // Year Published: 2019
    // Price: $49.99
    // ==========================================

        String title;
        String author;
        int yearPublished;
        double price;

    public static void main(String[] args) {
        
        System.out.println("=================================");
        Task11_Book book1 = new Task11_Book("Java Programing", "John Smith", 2021, 39.99);
        System.out.println("Book 1"+"\nTitle: "+ book1.title+"\nAuthor: " + book1.author+"\nYear Published: " + book1.yearPublished+"\nPrice: " + "$" + book1.price);
        System.out.println("=================================");

        Task11_Book book2 = new Task11_Book("Python Basics", "Jane Doe", 2020, 29.99);
        System.out.println("Book 2"+"\nTitle: "+ book2.title+"\nAuthor: " + book2.author+"\nYear Published: " + book2.yearPublished+"\nPrice: " + "$" + book2.price);
        System.out.println("=================================");

        Task11_Book book3 = new Task11_Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        System.out.println("Book 3"+"\nTitle: "+ book3.title+"\nAuthor: " + book3.author+"\nYear Published: " + book3.yearPublished+"\nPrice: " + "$" + book3.price);
        System.out.println("=================================");
    }
    public Task11_Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;


    }



}
