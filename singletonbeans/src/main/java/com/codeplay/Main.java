package com.codeplay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.VehicleService;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleServiceBean", VehicleService.class);

        System.out.println("HashCode for vehicleService1 is : " + vehicleService1.hashCode());
        System.out.println("HashCode for vehicleService2 is : " + vehicleService2.hashCode());

        if (vehicleService1 == vehicleService2) {
            System.out.println("vehicleServiceBean is scoped singleton");
        }

        context.close();
    }
}