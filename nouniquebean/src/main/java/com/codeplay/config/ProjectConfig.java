package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeplay.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("AUDI-8");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Tesla-X");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Toyota-Hilex");
        return veh;
    }
}
