package com.codeplay.beans;

// import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
    private String name;

    // this will create circular dependencies
    // @Autowired
    // private Person person;

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is " + name;
    }

    // public Person getPerson() {
    // return person;
    // }

    // public void setPerson(Person person) {
    // this.person = person;
    // }
}
