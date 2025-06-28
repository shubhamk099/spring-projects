package com.codeplay.beans.tyres;

import com.codeplay.interfaces.Tyres;

public class BridgeStoneTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Vehicle Moving With BridgeStone Tyres!");
    }
}
