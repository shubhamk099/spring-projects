package com.codeplay.factory;

import com.codeplay.tyres.BridgeStoneTyres;
import com.codeplay.tyres.MichelineTyres;
import com.codeplay.tyres.Tyres;

public class TyresFactory {
    private Tyres tyres;

    public Tyres getTyres(String tyreType) {
        if (tyreType.equalsIgnoreCase("MICHELINE")) {
            tyres = new MichelineTyres();
        } else if (tyreType.equalsIgnoreCase("BRIDGESTONE")) {
            tyres = new BridgeStoneTyres();
        }

        return tyres;
    }
}
