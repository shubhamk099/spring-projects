package com.codeplay.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplay.beans.Vehicle;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle teslaVehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the Spring Context is : " + teslaVehicle.getName());

        context.close();
    }
}