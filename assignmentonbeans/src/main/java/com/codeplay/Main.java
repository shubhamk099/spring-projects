package com.codeplay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Person;
import com.codeplay.beans.VehicleService;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        VehicleService vehicleService = context.getBean(VehicleService.class);
        // String[] persons = context.getBeanNamesForType(Person.class);

        System.out.println("Person name is : " + person.getName());
        System.out.println("Vehicle that the person owns is : " + person.getVehicleName());

        vehicleService.playMusic();
        vehicleService.moveVehicle();

        context.close();
    }
}