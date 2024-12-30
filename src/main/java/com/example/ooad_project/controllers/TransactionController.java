package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.Transaction;
import com.example.ooad_project.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable int id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable int id, @RequestBody Transaction transactionDetails) {
        Transaction transaction = transactionRepository.findById(id).orElse(null);
        if (transaction != null) {
            return transactionRepository.save(transaction);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable int id) {
        transactionRepository.deleteById(id);
    }
}
