package com.gla.interfacesabstraction.level1;

public class UPIPayment implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment successful: " + amount);
    }
}
