package com.codeplay.components.breaks;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Brakes;

@Primary
@Component
public class DiskBrakes implements Brakes {

    @Override
    public String stopVehicle() {
        return "Vehicle stopped with Disk Breaks";
    }
}
