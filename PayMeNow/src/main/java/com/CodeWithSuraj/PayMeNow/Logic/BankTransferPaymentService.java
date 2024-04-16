package com.CodeWithSuraj.PayMeNow.Logic;

public class BankTransferPaymentService implements PaymentService {
     private  double amount;

    public BankTransferPaymentService() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing BankTransfer Payment of " + amount );
    }
}
