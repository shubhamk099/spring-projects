package com.codeplay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplay.config.ProjectConfig;
import com.codeplay.model.Song;
import com.codeplay.service.VehicleService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());

        Song song = new Song();
        song.setTitle("Phir Se Uad Chala");
        song.setArtist("Mohit Chauhan");

        boolean vehicleStarted = false;

        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String applyBreakStatus = vehicleService.applyBreaks(vehicleStarted);

        System.out.println(moveVehicleStatus);
        System.out.println(playMusicStatus);
        System.out.println(applyBreakStatus);

        context.close();
    }
}