package com.example.ooad_project.repositories;
import com.example.ooad_project.entities.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleContainingIgnoreCase(String title);

    List<Book> findByGenre(String genre);

    List<Book> findBycurrentStockLessThan(Integer stockQuantity);



}
