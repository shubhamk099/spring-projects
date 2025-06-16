package com.codeplay.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Vehicle;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // if we don't provide the name, spring context will return the bean @Primary,
        // the default bean
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context : " + veh.getName());

        context.close();
    }
}