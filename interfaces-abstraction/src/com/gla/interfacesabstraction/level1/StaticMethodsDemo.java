package com.gla.interfacesabstraction.level1;

import java.time.LocalDate;

public class StaticMethodsDemo {
    public static void run() {
        System.out.println("Strong password: " + SecurityUtils.isStrongPassword("Insure@2026"));
        System.out.println("120 km in miles: " + UnitConverter.kmToMiles(120));
        System.out.println("75 kg in lbs: " + UnitConverter.kgToLbs(75));
        System.out.println("Invoice date: " + DateFormatUtility.formatDate(LocalDate.now(), "dd-MM-yyyy"));
    }
}
