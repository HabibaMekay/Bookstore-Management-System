package com.example.ooad_project.repositories;

import com.example.ooad_project.entities.Cashier;
import com.example.ooad_project.entities.Stocker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockerRepository extends JpaRepository<Stocker, Integer> {
    Stocker findByUsername(String username);
}
