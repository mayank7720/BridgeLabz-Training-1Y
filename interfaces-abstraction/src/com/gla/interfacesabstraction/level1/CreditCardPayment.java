package com.gla.interfacesabstraction.level1;

public class CreditCardPayment implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card payment successful: " + amount);
    }
}
