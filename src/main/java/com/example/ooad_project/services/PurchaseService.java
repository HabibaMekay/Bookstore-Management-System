package com.example.ooad_project.services;

import com.example.ooad_project.entities.Purchase;
import com.example.ooad_project.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    public Purchase getPurchaseById(int id) {
        return purchaseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Purchase not found with id: " + id));
    }

    public void savePurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    public void deletePurchaseById(int id) {
        purchaseRepository.deleteById(id);
    }

    public void processPurchase(int id) {
        Purchase purchase = getPurchaseById(id);
        purchase.process();
        purchaseRepository.save(purchase);
    }
}
