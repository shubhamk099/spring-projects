package com.codeplay.beans;

import org.springframework.stereotype.Component;

/**
 * Hear,we are creating beans with @Component annotation, earlier we wear doing
 * it with @Bean annotation, with this method - we need to mention @Component
 * on the top of POJO java class (class whose bean we want to creat)
 */

@Component
public class Vehicle {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Printing Hello, from Component Vehicle Bean");
    }
}
