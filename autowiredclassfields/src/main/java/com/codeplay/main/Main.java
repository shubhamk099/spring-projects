package com.codeplay.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Person;
import com.codeplay.beans.Vehicle;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = contex.getBean(Person.class);
        Vehicle vehicle = contex.getBean(Vehicle.class);

        System.out.println("Person name from the Spring Context is : " + person.getName());
        System.out.println("Vehicle name from the Spring Context is : " + vehicle.getName());

        System.out.println("Vehicle that person owns is : " + person.getVehicle());

        contex.close();
    }
}