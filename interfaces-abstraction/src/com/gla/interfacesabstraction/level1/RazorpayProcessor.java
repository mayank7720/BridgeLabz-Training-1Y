package com.gla.interfacesabstraction.level1;

public class RazorpayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Razorpay processed payment: " + amount);
    }
}
