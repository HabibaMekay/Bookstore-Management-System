package com.example.ooad_project.repositories;

import com.example.ooad_project.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {}
