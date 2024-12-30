package com.example.ooad_project.repositories;

import com.example.ooad_project.entities.BookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookListRepository extends JpaRepository<BookList, Integer> {}
