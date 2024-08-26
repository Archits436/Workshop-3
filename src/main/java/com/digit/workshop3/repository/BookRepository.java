package com.digit.workshop3.repository;

import com.digit.workshop3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
