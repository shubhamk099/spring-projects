package com.codeplay.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component(value = "personBean")
@Lazy
public class Person {

    private String name;
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicleBean") Vehicle vehicle) {
        System.out.println("Person Bean Created By Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleName() {
        return vehicle.getName();
    }

    @PostConstruct
    public void initialize() {
        this.name = "Lucy";
    }

}
