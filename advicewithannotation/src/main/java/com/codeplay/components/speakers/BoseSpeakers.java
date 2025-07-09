package com.codeplay.components.speakers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Speaker;
import com.codeplay.model.Song;

@Primary
@Component
public class BoseSpeakers implements Speaker {

    @Override
    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by " + song.getArtist() + " with Bose Speakers";
    }
}
