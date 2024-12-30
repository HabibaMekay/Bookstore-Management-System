package com.example.ooad_project.repositories;
import java.util.List;

import com.example.ooad_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T extends User> extends JpaRepository<T, Integer> {
        T findByUsername(String username);
}


