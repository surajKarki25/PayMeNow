package com.CodeWithSuraj.PayMeNow.Logic;

public class CreditCardPaymentService implements PaymentService {
    private  double amount;

    public CreditCardPaymentService() {
    }



    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public void processPayment( double amount) {
        System.out.println("Processing CreditCard Payment of " + amount );
    }
}
