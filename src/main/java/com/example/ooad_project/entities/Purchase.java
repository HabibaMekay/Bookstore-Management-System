package com.example.ooad_project.entities;

import jakarta.persistence.*;

@Entity
public class Purchase extends Transaction {

    public Purchase(int transactionID, int cashierID) {
        super(transactionID, "purchase", cashierID);
    }

    public Purchase() {

    }

    @Override
    public void process() {
        // moved to service
    }
}
