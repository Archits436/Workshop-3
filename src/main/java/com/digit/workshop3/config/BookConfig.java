package com.digit.workshop3.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.digit.workshop3.entity.Book;

@Configuration
public class BookConfig {

    @Bean
    @Qualifier("specificBook")
    public Book specificBook() {
        Book book = new Book();
        book.setTitle("Specific Book Title");
        book.setAuthor("Specific Author");
        return book;
    }
}

