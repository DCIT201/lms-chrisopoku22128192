package org.example;

public class Patron {
    private final String name;
    private final String id;

    // Constructor
    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Display patron details
    public void displayPatronInfo() {
        System.out.println("Patron Name: " + name);
        System.out.println("Patron ID: " + id);
    }
}

