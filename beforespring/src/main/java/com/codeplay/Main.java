package com.codeplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("without using factory");
        Vehicle vehicle = new Vehicle();
        vehicle.makeVehicle1();

        System.out.println("with using factory");
        vehicle.makeVehicle2();
    }
}