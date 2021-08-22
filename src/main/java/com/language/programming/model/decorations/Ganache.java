package com.language.programming.model.decorations;

import com.language.programming.model.CakePan;
import com.language.programming.model.CakeDecorator;

public class Ganache extends CakeDecorator {

    public Ganache(CakePan cake) {
        super(cake);
    }

    @Override
    public String getAdornment() {
        return "Ganache";
    }
}