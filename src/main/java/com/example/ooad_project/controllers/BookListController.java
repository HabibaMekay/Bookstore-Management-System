package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.BookList;
import com.example.ooad_project.repositories.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booklists")
public class BookListController {

    @Autowired
    private BookListRepository bookListRepository;

    @GetMapping("/{id}")
    public BookList getBookListById(@PathVariable int id) {
        return bookListRepository.findById(id).orElse(null);
    }

    @PostMapping
    public BookList createBookList(@RequestBody BookList bookList) {
        return bookListRepository.save(bookList);
    }
}
