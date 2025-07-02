package com.codeplay.components.tyres;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.codeplay.interfaces.Tyres;

@Primary
@Component
public class MichelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle Moving With Micheline Tyres";
    }
}
