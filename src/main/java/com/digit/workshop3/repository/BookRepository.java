package com.digit.workshop3.repository;

import com.digit.workshop3.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {
}
