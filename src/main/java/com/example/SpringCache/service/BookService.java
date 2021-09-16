package com.example.SpringCache.service;

import com.example.SpringCache.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    CacheService cacheService;

    public Book getBookDetails(String isn) {
       return cacheService.getBookDetails(isn);
    }

    public List<Book> getAllBooks() {
        return cacheService.getAllBooks();
    }
}
