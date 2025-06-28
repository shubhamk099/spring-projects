package com.codeplay.beans.tyres;

import com.codeplay.interfaces.Tyres;

public class MichelinTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Vehicle Moving With Micheline Tyres");
    }
}
