package com.example.SpringCache.repo;

import com.example.SpringCache.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
