package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.Stocker;
import com.example.ooad_project.repositories.StockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stockers")
public class StockerController {

    @Autowired
    private StockerRepository stockerRepository;

    @PostMapping
    public Stocker createStocker(@RequestBody Stocker stocker) {
        return stockerRepository.save(stocker);
    }

    @GetMapping("/{id}")
    public Stocker getStockerById(@PathVariable int id) {
        return stockerRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Stocker updateStocker(@PathVariable int id, @RequestBody Stocker stockerDetails) {
        Stocker stocker = stockerRepository.findById(id).orElse(null);
        if (stocker != null) {
            stocker.setUsername(stockerDetails.getUsername());
            stocker.setPassword(stockerDetails.getPassword());
            return stockerRepository.save(stocker);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteStocker(@PathVariable int id) {
        stockerRepository.deleteById(id);
    }
}
