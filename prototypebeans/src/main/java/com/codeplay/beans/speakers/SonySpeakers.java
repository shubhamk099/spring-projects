package com.codeplay.beans.speakers;

import com.codeplay.interfaces.Speaker;

public class SonySpeakers implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Playing Music From Sony Speakers!");
    }
}
