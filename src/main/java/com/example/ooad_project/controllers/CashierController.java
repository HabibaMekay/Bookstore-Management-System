package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.Cashier;
import com.example.ooad_project.repositories.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cashiers")
public class CashierController {

    @Autowired
    private CashierRepository cashierRepository;

    @PostMapping
    public Cashier createCashier(@RequestBody Cashier cashier) {
        return cashierRepository.save(cashier);
    }

    @GetMapping("/{id}")
    public Cashier getCashierById(@PathVariable int id) {
        return cashierRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Cashier updateCashier(@PathVariable int id, @RequestBody Cashier cashierDetails) {
        Cashier cashier = cashierRepository.findById(id).orElse(null);
        if (cashier != null) {
            cashier.setUsername(cashierDetails.getUsername());
            cashier.setPassword(cashierDetails.getPassword());
            return cashierRepository.save(cashier);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCashier(@PathVariable int id) {
        cashierRepository.deleteById(id);
    }
}
