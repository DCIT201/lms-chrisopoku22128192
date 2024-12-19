package org.example;

public class App {
    public static void main(String[] args) {
        // Library setup
        Library library = new Library();

        // Adding books
        Book book1 = new Book("2008", "Chris Opoku");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        // Display total books
        System.out.println("Total Books: " + library.getBookCount());

        // Find a book
        Book foundBook = library.findBookByTitle("2008");
        if (foundBook != null) {
            System.out.println("Book Found: " + foundBook.title() + " by " + foundBook.author());
        } else {
            System.out.println("Book not found.");
        }

        // Patron setup
        Patron patron = new Patron("Alice", "P001");
        patron.displayPatronInfo();
    }
}
