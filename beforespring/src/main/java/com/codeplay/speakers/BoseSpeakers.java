package com.codeplay.speakers;

public class BoseSpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Playing music from BoseSpeakers");
    }
}
