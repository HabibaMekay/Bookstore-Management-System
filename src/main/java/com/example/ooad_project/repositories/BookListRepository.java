package com.example.ooad_project.repositories;
import org.springframework.stereotype.Repository;
import com.example.ooad_project.entities.BookList;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookListRepository extends JpaRepository<BookList, Integer> {}
