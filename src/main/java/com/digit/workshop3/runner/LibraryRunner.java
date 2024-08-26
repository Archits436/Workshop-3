package com.digit.workshop3.runner;

import com.digit.workshop3.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner {
    private final Book book;
    @Autowired
    public LibraryRunner(@Qualifier("specificBook") Book book) {
        this.book = book;
    }
}

