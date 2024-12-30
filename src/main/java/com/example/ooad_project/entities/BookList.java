package com.example.ooad_project.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public Book searchByID(int bookID) {
        for (Book book : books) {
            if (bookID == book.getId())
                return book;
        }
        return null;
    }

    public Book searchByName(String bookName) {
        for (Book book : books) {
            if (bookName.equals(book.getTitle()))  // Using .equals to compare strings
                return book;
        }
        return null;
    }
}
