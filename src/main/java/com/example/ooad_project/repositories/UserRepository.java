package com.example.ooad_project.repositories;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.ooad_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
        User findByUsername(String username);
}

