package com.codeplay.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Vehicle;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context : " + vehicle.getName());

        /*
         * the var keyword was introduced in java 10, type inference is used in
         * var keyword in which it detects automatically the datatype of a variable
         * based on the surrounding context
         */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);

        System.out.println("Vehicle name from spring context : " + veh.getName());

        String name = context.getBean(String.class);
        System.out.println("Name from spring context : " + name);

        Integer number = context.getBean(Integer.class);
        System.out.println("Number from spring context : " + number);

        context.close();
    }
}