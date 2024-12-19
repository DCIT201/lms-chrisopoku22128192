package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Get total books
    public int getBookCount() {
        return books.size();
    }
}

