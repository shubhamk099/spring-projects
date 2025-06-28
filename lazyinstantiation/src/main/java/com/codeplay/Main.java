package com.codeplay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.beans.Person;
import com.codeplay.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before Creating the personBean");
        // personBean will be created when it is refered to the first time, hear in the
        // next line
        Person person = context.getBean(Person.class);
        System.out.println("After creating the personBean");

        System.out.println(person.getName());

        context.close();
    }
}