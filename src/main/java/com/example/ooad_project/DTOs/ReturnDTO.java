package com.example.ooad_project.DTOs;

public class ReturnDTO {
    private int transactionID;
    private int cashierID;
    private String transactionType;

    public ReturnDTO() {}

    public ReturnDTO(int transactionID, int cashierID, String transactionType) {
        this.transactionID = transactionID;
        this.cashierID = cashierID;
        this.transactionType = transactionType;
    }


    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getCashierID() {
        return cashierID;
    }

    public void setCashierID(int cashierID) {
        this.cashierID = cashierID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
