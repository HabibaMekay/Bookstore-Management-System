package com.example.ooad_project.controllers;

import com.example.ooad_project.entities.Purchase;
import com.example.ooad_project.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @PostMapping
    public Purchase createPurchase(@RequestBody Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @GetMapping("/{id}")
    public Purchase getPurchaseById(@PathVariable int id) {
        return purchaseRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Purchase updatePurchase(@PathVariable int id, @RequestBody Purchase purchaseDetails) {
        Purchase purchase = purchaseRepository.findById(id).orElse(null);
        if (purchase != null) {
            purchase.setCashierID(purchaseDetails.getCashierID());
            return purchaseRepository.save(purchase);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePurchase(@PathVariable int id) {
        purchaseRepository.deleteById(id);
    }
}
