package com.language.programming.model.decorations;

import com.language.programming.model.CakePan;
import com.language.programming.model.CakeDecorator;

public class Buttercream extends CakeDecorator {

    public Buttercream(CakePan cake) {
        super(cake);
    }

    @Override
    public String getAdornment() {
        return "Buttercream";
    }

}