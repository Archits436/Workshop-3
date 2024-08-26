package com.digit.workshop3.controller;

import com.digit.workshop3.entity.Books;
import com.digit.workshop3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private LibraryService libraryService;

    @PostMapping("addBook")
    public Books addBook(Books book) {
        return libraryService.addBook(book);
    }

    @GetMapping("allBooks")
    public List<Books> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @GetMapping("books/{id}")
    public Optional<Books> getBookById(Long id) {
        return libraryService.getBookById(id);
    }

    @PutMapping("books/{id}/update")
    public Books updateBook(Long id, Books bookDetails) {
        return libraryService.updateBook(id, bookDetails);
    }

    @DeleteMapping("books/{id}")
    public void deleteBook(Long id) {
        libraryService.deleteBook(id);
    }
}
