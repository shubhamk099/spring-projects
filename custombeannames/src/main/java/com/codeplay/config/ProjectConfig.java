package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeplay.beans.Vehicle;

@Configuration
public class ProjectConfig {

    // three methods to give custom names to beans
    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("AUDI-8");
        return veh;
    }

    @Bean(value = "teslaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Tesla-X");
        return veh;
    }

    @Bean("toyotaVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Toyota-Hilex");
        return veh;
    }
}
