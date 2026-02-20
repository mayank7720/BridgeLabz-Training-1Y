package com.gla.interfacesabstraction.level1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesDemo {
    public static void run() {
        Predicate<Double> temperatureAlert = temperature -> temperature > 38.0;
        double currentTemperature = 39.2;
        System.out.println("Temperature alert: " + temperatureAlert.test(currentTemperature));

        Function<String, Integer> stringLengthChecker = String::length;
        String message = "Policy renewal reminder";
        int limit = 20;
        int length = stringLengthChecker.apply(message);
        System.out.println("Message length: " + length);
        System.out.println("Exceeds limit: " + (length > limit));

        Runnable backgroundJob = () -> System.out.println("Background job executed by " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(backgroundJob);
        executorService.shutdown();
    }
}
