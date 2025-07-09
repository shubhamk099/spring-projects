package com.codeplay.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.codeplay.service.VehicleService;

import jakarta.annotation.PostConstruct;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name;
    private final VehicleService vehicleService;

    // vehicleService bean is of singleton type, but hear the parent Vehicle is of
    // singleton, so we will get the same instance (act like singleton)
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

/**
 * When a prototype bean is injected into a singleton bean, Spring only creates
 * and injects the prototype once — at the time the singleton is created. After
 * that, the singleton bean holds that same instance permanently.
 * 
 * So:
 * 
 * The VehicleService instance is created once when the Vehicle bean is created.
 * 
 * Even though VehicleService is prototype-scoped, Spring injects only one
 * instance into Vehicle.
 * 
 * As a result, vehicleService acts like a singleton inside Vehicle.
 */