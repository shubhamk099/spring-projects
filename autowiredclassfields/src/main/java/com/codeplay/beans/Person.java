package com.codeplay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Person {
    private String name;

    // @Autowired(required = false) - if we don't want exception if bean is not
    // available, it will take null
    @Autowired
    private Vehicle vehicle;

    public Person() {
        System.out.println("Person bean created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Lucy";
    }

    @Override
    public String toString() {
        return "Person name is " + name;
    }
}
