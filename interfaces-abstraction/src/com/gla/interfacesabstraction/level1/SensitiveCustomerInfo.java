package com.gla.interfacesabstraction.level1;

public class SensitiveCustomerInfo implements SensitiveData {
    private final String customerId;
    private final String secret;

    public SensitiveCustomerInfo(String customerId, String secret) {
        this.customerId = customerId;
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "SensitiveCustomerInfo{customerId='" + customerId + "', secret='" + secret + "'}";
    }
}
