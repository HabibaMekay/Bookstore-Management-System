package com.example.ooad_project.services;

import com.example.ooad_project.entities.Transaction;
import com.example.ooad_project.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(int id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Transaction not found with id: " + id));
    }

    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    public void deleteTransactionById(int id) {
        transactionRepository.deleteById(id);
    }

    public void processTransaction(int id) {
        Transaction transaction = getTransactionById(id);
        transaction.process();
        transactionRepository.save(transaction);
    }
}
