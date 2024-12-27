package entities;

public class Book {
    private String title;
    private String genre;
    private int currentStock;
    private int id;
    private double price;
    public Book(String title, String genre, int currentStock, int id, double price) {
        this.title = title;
        this.genre = genre;
        this.currentStock = currentStock;
        this.id = id;
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
