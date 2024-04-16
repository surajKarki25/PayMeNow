package com.CodeWithSuraj.PayMeNow.Logic;

public class PayPalPaymentService implements  PaymentService {
    private  double amount;

    public PayPalPaymentService() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of " + amount );
    }
}
