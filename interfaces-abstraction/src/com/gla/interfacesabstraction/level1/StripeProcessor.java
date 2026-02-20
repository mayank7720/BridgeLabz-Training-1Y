package com.gla.interfacesabstraction.level1;

public class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe processed payment: " + amount);
    }
}
