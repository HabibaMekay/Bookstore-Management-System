package com.example.ooad_project.repositories;
import org.springframework.stereotype.Repository;
import com.example.ooad_project.entities.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CashierRepository extends JpaRepository<Cashier, Integer> {
    Cashier findByUsername(String username);
}
