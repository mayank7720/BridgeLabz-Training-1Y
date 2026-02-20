package com.gla.interfacesabstraction.level1;

public class BusRental implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Bus rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
