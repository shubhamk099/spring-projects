package com.codeplay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Brakes;
import com.codeplay.interfaces.Speaker;
import com.codeplay.interfaces.Tyres;
import com.codeplay.model.Song;

@Component(value = "vehicleServiceBean")
public class VehicleService {

    private Speaker speaker;
    private Tyres tyres;
    private Brakes breaks;

    @Autowired
    public VehicleService(Speaker speaker, Tyres tyres, Brakes breaks) {
        System.out.println("VehicleService Bean Created By Spring");
        this.speaker = speaker;
        this.tyres = tyres;
        this.breaks = breaks;
    }

    public String playMusic(boolean vehicleStarted, Song song) {
        return speaker.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        return tyres.rotate();
    }

    public String applyBreaks(boolean vehicleStarted) {
        return breaks.stopVehicle();
    }
}
