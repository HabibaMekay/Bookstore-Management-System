package com.example.ooad_project.repositories;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.ooad_project.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
        AppUser findByUsername(String username);
}

