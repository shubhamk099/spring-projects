package com.codeplay.beans;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is " + name;
    }
}
