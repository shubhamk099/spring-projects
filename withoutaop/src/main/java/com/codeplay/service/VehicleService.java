package com.codeplay.service;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Brakes;
import com.codeplay.interfaces.Speaker;
import com.codeplay.interfaces.Tyres;
import com.codeplay.model.Song;

@Component(value = "vehicleServiceBean")
public class VehicleService {

    private final Logger logger = Logger.getLogger(VehicleService.class.getName());

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
        Instant start = Instant.now();
        logger.info("Method execution started");
        String music = null;

        if (vehicleStarted) {
            music = speaker.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }

        logger.info("Method execution ended");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("Method execution started");
        String status = null;

        if (vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }

        logger.info("Method execution ended");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return status;
    }

    public String applyBreaks(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("Method execution started");
        String status = null;

        if (vehicleStarted) {
            status = breaks.stopVehicle();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }

        logger.info("Method execution ended");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return status;
    }
}
