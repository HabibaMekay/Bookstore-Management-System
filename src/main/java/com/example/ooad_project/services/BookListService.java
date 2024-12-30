package com.example.ooad_project.services;

import com.example.ooad_project.entities.Book;
import com.example.ooad_project.entities.BookList;
import com.example.ooad_project.repositories.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListService {

    @Autowired
    private BookListRepository bookListRepository;

    public List<BookList> getAllBookLists() {
        return bookListRepository.findAll();
    }

    public BookList getBookListById(int id) {
        return bookListRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("BookList not found with id: " + id));
    }

    public void saveBookList(BookList bookList) {
        bookListRepository.save(bookList);
    }

    public void deleteBookListById(int id) {
        bookListRepository.deleteById(id);
    }

    public void addBookToList(int bookListId, Book book) {
        BookList bookList = getBookListById(bookListId);
        bookList.getBooks().add(book);
        bookListRepository.save(bookList);
    }

    public void removeBookFromList(int bookListId, int bookId) {
        BookList bookList = getBookListById(bookListId);
        bookList.getBooks().removeIf(book -> book.getId() == bookId);
        bookListRepository.save(bookList);
    }

    public Book searchBookById(int bookListId, int bookId) {
        BookList bookList = getBookListById(bookListId);
        return bookList.searchByID(bookId);
    }

    public Book searchBookByName(int bookListId, String bookName) {
        BookList bookList = getBookListById(bookListId);
        return bookList.searchByName(bookName);
    }
}
