package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.codeplay.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("AUDI-8");
        return veh;
    }

    @Primary
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
