package com.codeplay.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Vehicle;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context : " + veh1.getName());

        Vehicle veh2 = context.getBean("teslaVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context : " + veh2.getName());

        Vehicle veh3 = context.getBean("toyotaVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context : " + veh3.getName());

        context.close();
    }
}