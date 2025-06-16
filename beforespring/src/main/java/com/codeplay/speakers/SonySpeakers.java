package com.codeplay.speakers;

public class SonySpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Playing music from SonySpeakers");
    }
}
