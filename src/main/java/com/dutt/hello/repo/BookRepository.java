package com.dutt.hello.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dutt.hello.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
 
}
