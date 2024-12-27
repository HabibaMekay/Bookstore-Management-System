package entities;

import java.util.ArrayList;
import java.util.List;

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

    public void addBook(Book book){
        //implement
    }

    public void removeBook(Book book){
        //implement
    }

    public boolean isEmpty(){
        return books.isEmpty();
    }

//    public Book searchByName(String bookName){
//        //implement
//    }
//
//    public Book searchByID(int bookID){
//        //implement
//    }


}
