package com.gla.interfacesabstraction.level1;

public class EncryptionService {
    public void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive object: " + obj);
        } else {
            System.out.println("No encryption needed: " + obj);
        }
    }
}
