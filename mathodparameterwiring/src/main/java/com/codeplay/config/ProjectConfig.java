package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeplay.beans.Person;
import com.codeplay.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Tesla Model S");
        return veh;
    }

    // Wiring beans using method parameters
    // Spring inject the vehicle bean to the person bean using Dependency Injection
    @Bean
    public Person person(Vehicle vehicle) {
        Person per = new Person();
        per.setName("Shubham Kumar");
        per.setVehicle(vehicle);
        return per;
    }
}
