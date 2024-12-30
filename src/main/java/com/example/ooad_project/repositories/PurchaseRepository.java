package com.example.ooad_project.repositories;

import com.example.ooad_project.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {}
