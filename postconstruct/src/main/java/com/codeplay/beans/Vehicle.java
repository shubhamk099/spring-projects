package com.codeplay.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    // // constructor is also working to initialize the class fields
    // Vehicle() {
    // this.name = "Tesla Model X";
    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Printing Hello, from Component Vehicle Bean");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Tesla Model X";
    }

}
