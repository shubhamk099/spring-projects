package com.codeplay;

import com.codeplay.factory.SpeakerFactory;
import com.codeplay.factory.TyresFactory;
import com.codeplay.speakers.SonySpeakers;
import com.codeplay.speakers.Speakers;
import com.codeplay.tyres.BridgeStoneTyres;
import com.codeplay.tyres.Tyres;

public class Vehicle {

    private Speakers speakers;

    private Tyres tyres;

    // method 1 : creating the objects manually inside the class (tight coupling)
    public void makeVehicle1() {
        speakers = new SonySpeakers();
        speakers.makeSound();

        tyres = new BridgeStoneTyres();
        tyres.moveVehicle();

        // hear if we need to change the vendor from one to another, we have to change a
        // lot of code hear
    }

    // method 2 : using abstract factor desgin (loose coupling)
    public void makeVehicle2() {
        SpeakerFactory speakerFactory = new SpeakerFactory();
        speakers = speakerFactory.getSpeakers("SONY");
        speakers.makeSound();

        TyresFactory tyresFactory = new TyresFactory();
        tyres = tyresFactory.getTyres("BRIDGESTONE");
        tyres.moveVehicle();

        // hear we are using factories to create objects, it is better but if we need to
        // change the vendor from one to anotherwe still have to change some code hear
    }
}
