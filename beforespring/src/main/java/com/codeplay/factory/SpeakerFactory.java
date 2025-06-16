package com.codeplay.factory;

import com.codeplay.speakers.BoseSpeakers;
import com.codeplay.speakers.SonySpeakers;
import com.codeplay.speakers.Speakers;

public class SpeakerFactory {
    private Speakers speakers;

    public Speakers getSpeakers(String speakerType) {
        if (speakerType.equalsIgnoreCase("SONY")) {
            speakers = new SonySpeakers();
        } else if (speakerType.equalsIgnoreCase("BOSE")) {
            speakers = new BoseSpeakers();
        }

        return speakers;
    }
}
