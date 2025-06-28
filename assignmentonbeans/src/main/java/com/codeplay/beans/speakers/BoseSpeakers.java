package com.codeplay.beans.speakers;

import com.codeplay.interfaces.Speaker;

public class BoseSpeakers implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Playing Music From Bose Speakers!");
    }
}
