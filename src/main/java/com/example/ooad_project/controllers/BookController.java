package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.ooad_project.services.BookService;

//@Controller
//@RequestMapping("/books")
//public class BookController {
//    @Autowired
//    private BookService bookService;
//
//    @GetMapping
//    public String listBooks(Model model) {
//        model.addAttribute("books", bookService.getAllBooks());
//        return "books";
//    }
//
//    @GetMapping("/new")
//    public String showAddBookForm(Model model) {
//        model.addAttribute("book", new Book());
//        return "add_book";
//    }
//
//    @PostMapping
//    public String saveBook(@ModelAttribute("book") Book book) {
//        bookService.saveBook(book);
//        return "redirect:/books";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditBookForm(@PathVariable int id, Model model) {
//        model.addAttribute("book", bookService.getBookById(id));
//        return "edit_book";
//    }
//
//    @PostMapping("/{id}")
//    public String editBook(@PathVariable int id, @ModelAttribute("book") Book book) {
//        book.setId(id);
//        bookService.saveBook(book);
//        return "redirect:/books";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteBook(@PathVariable int id) {
//        bookService.deleteBookById(id);
//        return "redirect:/books";
//    }
//}
//
////
////package com.example.ooad_project.controllers;
////
////import com.example.ooad_project.entities.Book;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PostMapping;
////
////import com.example.ooad_project.repositories.BookRepository;
////
////@Controller
////public class BookController {
////    @Autowired
////    private BookRepository bookRepository;
////
////    @GetMapping("/books")
////    public String listBooks(Model model) {
////        model.addAttribute("books", bookRepository.findAll());
////        return "books";
////    }
////
////    @PostMapping("/addBook")
////    public String addBook(Book book) {
////        bookRepository.save(book);
////        return "redirect:/books";
////    }
////}


@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    @GetMapping("/new")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "add_book";
    }

    @PostMapping
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String showEditBookForm(@PathVariable int id, Model model) {
        Book book = bookService.getBookById(id);
        if (book == null) {
            throw new IllegalArgumentException("Book not found");
        }
        model.addAttribute("book", book);
        return "edit_book";
    }

    @PostMapping("/{id}")
    public String editBook(@PathVariable int id, @ModelAttribute("book") Book book) {
        book.setId(id);
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}
