package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookList {
    private List<Book> books;
    public BookList() {
        books = new ArrayList<>();
    }
    public List<Book> getBooks(){
        return books;
    }

    /// /////////////////////////////////
    /// /////////////////////////////////
    /// /////////////////////////////////


    public boolean isEmpty(){
        return books.isEmpty();
    }

    public Book searchByID(int bookID){
        for(Book book : books){
            if(bookID == book.getId())
                return book;
        }
        return null;
    }

    public Book searchByName(String bookName){
        for(Book book : books){
            //this was recommended by intelij idk if it's correct
            if(Objects.equals(bookName, book.getTitle()))
                return book;
        }
        return null;
    }




}
