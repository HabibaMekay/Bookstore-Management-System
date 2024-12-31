package com.example.ooad_project.entities;

import jakarta.persistence.*;

@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   moved up
    private int id;
    private String title;
    private String genre;
    private int currentStock;
    private double price;

    public Book() {}

    public Book(String title, String genre, int currentStock, double price) {
        this.title = title;
        this.genre = genre;
        this.currentStock = currentStock;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getCurrentStock() {
        return currentStock;
    }
    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
