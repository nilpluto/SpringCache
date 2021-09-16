package com.example.SpringCache.service;

import com.example.SpringCache.model.Book;
import com.example.SpringCache.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CacheService {
    @Autowired
    BookRepository bookRepository;

    @CachePut(value = "cacheBook", key="#isn")
    public Book getBookDetails(String isn) {
        System.out.println(" Inside getBookDetails ...");
        return bookRepository.findById(isn).get();
    }

    @Cacheable(value = "cacheAllBooks")
    public List<Book> getAllBooks() {
        System.out.println(" Inside getBookDetails ...");
        return bookRepository.findAll();
    }
}
