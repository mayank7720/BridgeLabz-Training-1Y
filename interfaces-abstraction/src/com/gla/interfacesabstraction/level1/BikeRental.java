package com.gla.interfacesabstraction.level1;

public class BikeRental implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Bike rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
