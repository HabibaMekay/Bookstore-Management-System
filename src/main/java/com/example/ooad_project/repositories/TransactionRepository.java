package com.example.ooad_project.repositories;

import com.example.ooad_project.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {}
