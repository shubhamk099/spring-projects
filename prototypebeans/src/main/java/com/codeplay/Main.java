package com.codeplay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.VehicleService;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean(VehicleService.class);

        System.out.println("HashCode of vehicleService1 : " + vehicleService1.hashCode());
        System.out.println("HashCode for vehicleService2 : " + vehicleService2.hashCode());

        if (vehicleService1.hashCode() != vehicleService2.hashCode()) {
            System.out.println("vehicleService bean is scoped prototype");
        }

        vehicleService1.playMusic();
        vehicleService2.playMusic();

        context.close();
    }
}