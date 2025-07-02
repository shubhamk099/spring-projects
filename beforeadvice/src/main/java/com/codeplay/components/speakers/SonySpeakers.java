package com.codeplay.components.speakers;

import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Speaker;
import com.codeplay.model.Song;

@Component
public class SonySpeakers implements Speaker {

    @Override
    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by " + song.getArtist() + " with Sony Speakers";
    }
}
