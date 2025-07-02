package com.codeplay.components.tyres;

import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle Moving With BridgeStone Tyres!";
    }
}
