package com.example.SpringCache.controller;

import com.example.SpringCache.model.Book;
import com.example.SpringCache.service.BookService;
import com.example.SpringCache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookCacheController {

    @Autowired
    BookService bookService;

    @GetMapping("/book/{isn}")
    public Book getBookData(@PathVariable String isn) {
        System.out.println(" Request Received for isn: " + isn);
        return bookService.getBookDetails(isn);
    }


    @GetMapping("/book")
    public List<Book> getAllBookData() {
        System.out.println(" Request Received for All Books: ");
        return bookService.getAllBooks();
    }
}
