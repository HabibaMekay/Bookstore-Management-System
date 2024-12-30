package com.example.ooad_project.services;

import com.example.ooad_project.entities.Cashier;
import com.example.ooad_project.repositories.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashierService {

    @Autowired
    private CashierRepository cashierRepository;

    public List<Cashier> getAllCashiers() {
        return cashierRepository.findAll();
    }

    public Cashier getCashierById(int id) {
        return cashierRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cashier not found with id: " + id));
    }

    public void saveCashier(Cashier cashier) {
        cashierRepository.save(cashier);
    }

    public void deleteCashierById(int id) {
        cashierRepository.deleteById(id);
    }

    public boolean loginCashier(String username, String password) {
        Cashier cashier = cashierRepository.findByUsername(username);
        return cashier != null && cashier.getPassword().equals(password);
    }

    public void logoutCashier() {
        System.out.println("Cashier logged out successfully.");
    }

    public int scanBook(int cashierId, int bookId) {
        // Implement book scanning logic here
        return bookId;
    }
}
