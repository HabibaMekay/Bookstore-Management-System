package com.example.ooad_project.entities;

import jakarta.persistence.*;

@Entity
public class Return extends Transaction {

    public Return(int transactionID, int cashierID) {
        super(transactionID, "return", cashierID);
    }

    public Return() {

    }

    @Override
    public void process() {
        // Implement return-specific processing
    }
}
