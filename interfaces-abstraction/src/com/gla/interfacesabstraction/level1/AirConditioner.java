package com.gla.interfacesabstraction.level1;

public class AirConditioner implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("AC is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is OFF");
    }
}
