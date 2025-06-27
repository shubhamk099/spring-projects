package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeplay.beans.Person;
import com.codeplay.beans.Vehicle;

@Configuration
public class ProjectConfig {

    // Two vehicle beans will not be created,
    // Even if vehicle() is called twice in code, Spring ensures the same bean
    // instance is returned — because it’s managing it as a singleton by default.
    @Bean
    public Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Tesla Model S");
        return veh;
    }

    @Bean
    public Person person() {
        Person per = new Person();
        per.setName("Shubham Kumar");
        // hear, we have created the bean of vehicle, and wired it to the person bean
        // it will return the same vehicle bean already created
        per.setVehicle(vehicle());
        return per;
    }
}
