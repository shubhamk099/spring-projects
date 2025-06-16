package com.codeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeplay.beans.Vehicle;

/*
 * spring @Configuration annotation is part of the spring core framework,
 * spring @Configuration annotation indicates that the class has @Bean annotation
 * methods, so spring container can process the class and generate spring beans
 * to be used in the application
 */

@Configuration
public class ProjectConfig {

    /*
     * the methods name usually follow verbs notation, but for methods
     * which we use to create beans, can use nouns as name, this will be a
     * good practice as the method name will become
     * bean name as well in the context
     */

    /*
     * @Bean annotation, which lets spring know that it needs to call
     * this method when it initializes its context and adds the returned
     * vaalue to the context
     */
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("AUDI - 8");
        return veh;
    }

    @Bean
    String name() {
        return "Hello, World!";
    }

    @Bean
    Integer number() {
        return 11;
    }
}
