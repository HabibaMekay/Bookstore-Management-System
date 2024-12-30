package com.example.ooad_project.services;

import com.example.ooad_project.entities.Stocker;
import com.example.ooad_project.repositories.StockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockerService {

    @Autowired
    private StockerRepository stockerRepository;

    public List<Stocker> getAllStockers() {
        return stockerRepository.findAll();
    }

    public Stocker getStockerById(int id) {
        return stockerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Stocker not found with id: " + id));
    }

    public void saveStocker(Stocker stocker) {
        stockerRepository.save(stocker);
    }

    public void deleteStockerById(int id) {
        stockerRepository.deleteById(id);
    }

    public boolean loginStocker(String username, String password) {
        Stocker stocker = stockerRepository.findByUsername(username);
        return stocker != null && stocker.getPassword().equals(password);
    }

    public void logoutStocker() {
        System.out.println("Stocker logged out successfully.");
    }
}
