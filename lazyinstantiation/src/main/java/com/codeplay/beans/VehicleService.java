package com.codeplay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Speaker;
import com.codeplay.interfaces.Tyres;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Component(value = "vehicleServiceBean")
public class VehicleService {
    private Speaker speaker;
    private Tyres tyres;

    @Autowired
    public VehicleService(Speaker speaker, Tyres tyres) {
        System.out.println("VehicleService Bean Created By Spring");
        this.speaker = speaker;
        this.tyres = tyres;
    }

    public void playMusic() {
        speaker.makeSound();
    }

    public void moveVehicle() {
        tyres.rotate();
    }
}
