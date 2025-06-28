package com.codeplay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name;
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(@Qualifier("vehicleServiceBean") VehicleService vehicleService) {
        System.out.println("Vehicle Bean Created By Spring");
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Audi A8";
    }
}
