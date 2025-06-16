package com.codeplay.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Vehicle;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        /*
         * NoUniqueBeanDefinitionException: No qualifying bean of type
         * 'com.codeplay.beans.Vehicle' available: expected single matching bean but
         * found 3: vehicle1,vehicle2,vehicle3
         * 
         * - To solve this exception, we can refer that perticular bean by its name
         */

        // var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // Vehicle veh = context.getBean(Vehicle.class);

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle2", Vehicle.class);

        System.out.println("Vehicle name from spring context : " + veh.getName());

        context.close();
    }
}