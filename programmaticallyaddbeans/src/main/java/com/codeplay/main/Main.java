package com.codeplay.main;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Vehicle;
import com.codeplay.config.ProjectConfig;
import com.codeplay.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Supplier<Vehicle> audiSupplier = () -> {
        // Vehicle audi = new Vehicle();
        // audi.setName("AUDI-R8");
        // return audi;
        // };

        // creating supplier for audi and tesla
        Supplier<Vehicle> audiSupplier = VehicleFactory::createAudiVehicle;
        Supplier<Vehicle> teslaSupplier = VehicleFactory::createTeslaVehicle;

        // generating a random value from 0 to 9
        Random random = new Random();
        int randomValue = random.nextInt(10);
        System.out.println("Random Value Is : " + randomValue);

        // creating beans programmatically
        if (randomValue % 2 == 0) {
            context.registerBean("audiBean", Vehicle.class, audiSupplier);
        } else {
            context.registerBean("teslaBean", Vehicle.class, teslaSupplier);
        }

        // trying to get beans
        Vehicle audiVehicle = null;
        Vehicle teslaVehicle = null;

        try {
            audiVehicle = context.getBean("audiBean", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while getting audiBean from context");
        }

        try {
            teslaVehicle = context.getBean("teslaBean", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while getting teslaBean from context");
        }

        if (null != audiVehicle) {
            System.out.println("Programming Vehicle name from the Spring Context is : " + audiVehicle.getName());
        } else if (null != teslaVehicle) {
            System.out.println("Programming Vehicle name from the Spring Context is : " + teslaVehicle.getName());
        }

        context.close();

    }
}