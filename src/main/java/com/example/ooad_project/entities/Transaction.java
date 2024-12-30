package com.example.ooad_project.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // or SINGLE_TABLE, depending on your needs
public abstract class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionID;

    private int cashierID;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> bookList;

    public Transaction(int transactionID, String type, int cashierID) {
        this.transactionID = transactionID;
        this.cashierID = cashierID;
        this.date = new Date();
        this.type = type;
        this.bookList = new ArrayList<>();
    }

    public Transaction() {

    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getCashierID() {
        return cashierID;
    }

    public void setCashierID(int cashierID) {
        this.cashierID = cashierID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    abstract public void process();

    public double calculateTotal() {
        double total = 0;
        for (Book book : bookList) {
            total += book.getPrice();
        }
        return total;
    }
}
