package com.gla.interfacesabstraction.level1;

public class WalletPayment implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Wallet payment successful: " + amount);
    }
}
