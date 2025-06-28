package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.codeplay.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = "com.codeplay.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Toyota Camry");
        return veh;
    }

    @Bean
    public Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Tesls Model X");
        return veh;
    }

    @Bean
    public Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi A8");
        return veh;
    }
}
