package com.codingdojo.books.controllers;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BooksController {
    private final BookService service;

    public BooksController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/books";
    }

    @RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = service.allBooks();
        model.addAttribute("books", books);
        return "books.jsp";
    }

    @GetMapping("/books/{id}")
    public String read(@PathVariable("id") Long id, Model model) {
        Book book = service.findBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
}
